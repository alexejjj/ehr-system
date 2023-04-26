import React, {useEffect, useState} from 'react';
import classes from './Signup.module.css'
import {IoPersonCircle} from "react-icons/io5";
import {useNavigate} from "react-router-dom";
import {useAuth} from "../../../contexts/UserContext";


const Login = () => {
    const [formData, setFormData] = useState({
        email: '',
        password: ''
    })
    const navigate = useNavigate()
    const {login} = useAuth()

    useEffect(() => {
        fetch('/isUserAuth', {
            method: 'GET',
            headers: {
                'x-access-token': localStorage.getItem('token')
            }
        }).then(res => res.json()).then(data => data.isLoggedIn ? navigate('/dashboard') : null)
    }, [])

    const onChange = event => {
        setFormData({...formData, [event.target.id]: event.target.value})
    }

    const onSubmit = event => {
        event.preventDefault()
        console.log(formData)
        fetch('http://localhost:4000/login', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        }).then(res => res.json()).then(data => {
            login(data.token, JSON.stringify(data.user)).then(() => navigate('/dashboard'))
            setFormData({email: '', password: ''})
        })
    }

    return (
        <form className={classes.form} onSubmit={event => onSubmit(event)}>
             <IoPersonCircle style={{margin: '0 auto'}} color='#CEDCFF' size={218}/>
             <div className={classes.content__area}>
                 <div className={classes.fields__area}>
                         <input type='text'
                                id='email'
                                value={formData.email}
                                onChange={event => onChange(event)}
                                className={classes.input__field}
                                placeholder='email'/>
                        <input type='text'
                               id='password'
                               value={formData.password}
                               onChange={event => onChange(event)}
                               className={classes.input__field}
                               placeholder='password'/>
                 </div>
                 <div className={classes.image}>Some photo</div>
             </div>
            <button type='submit' className={classes.btn}>Login</button>
        </form>
    );
};

export default Login;
