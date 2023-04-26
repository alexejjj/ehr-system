import React, {useEffect, useState} from 'react';
import classes from './Header.module.css'
import Profile from "../../profile/Profile";
import axios from "axios";
import {useNavigate} from "react-router-dom";
import {NodeService} from "../../../API/PatientService";


const Header = () => {
    const [patients, setPatients] = useState([])
    const [suggestions, setSuggestions] = useState([])
    const [query, setQuery] = useState('')
    const navigate = useNavigate()
    const user = JSON.parse(localStorage.getItem('user')) ? localStorage.getItem('user') : {}

    useEffect(() => {
        NodeService.getAllDoctorPatients(localStorage.getItem('token')).then(response => setPatients(response))
    }, [])

    const handleEnterKey = event => {
        if (event.key === 'Enter') {
            const suggestion = suggestions.filter(suggestion => {
                if (suggestion.firstName + ' ' + suggestion.lastName === query) {
                    return suggestion
                }
            })
            onClick(suggestion[0])
        }
    }

    const onClick = suggestion => {
        console.log(suggestion)
        navigate(`/patients/${suggestion.ehrId}`, {replace: true})
        setQuery('')
        setSuggestions([])
    }

    const onChange = event => {
        const text = event.target.value
        let matches = []
        if (text.length > 0) {
            matches = patients.filter(patient => {
                const re = new RegExp(`${text}`, 'gi')
                const fullName = patient.firstName + patient.lastName
                return fullName.match(re)
            })
        }
        setSuggestions(matches)
        setQuery(text)
    }

    return (
        <section className={classes.header__wrap}>
            <header className={classes.header}>
                <div className={classes.search__area}>
                    <label>
                        <input className={classes.search}
                               value={query}
                               onChange={event => onChange(event)}
                               onKeyDown={event => handleEnterKey(event)}
                               placeholder='Search...'
                        />
                    </label>
                    {
                        suggestions && (
                            <div style={{backgroundColor: '#fff',
                                         borderRadius: '0 0px 10px 0',
                                         width: '400px',
                                         boxShadow: '0 4px 4px rgba(0, 0, 0, 0.25)',
                                         backdropFilter: 'blur(4px)',
                                         zIndex: '1000',
                                         position: 'absolute',
                                         marginTop: '40px'}}>
                                {
                                    suggestions.map((suggestion, idx) => (
                                        <div key={idx}
                                             className={classes.search__result}
                                             onClick={() => onClick(suggestion)}
                                        >
                                            {suggestion.firstName + ' ' + suggestion.lastName}
                                        </div>
                                    ))
                                }
                            </div>
                        )
                    }
                </div>
                <div className={classes.profile}>
                    <div className={classes.avatar}></div>
                    <Profile user={user}/>
                </div>
            </header>
        </section>
    );
};

export default Header;
