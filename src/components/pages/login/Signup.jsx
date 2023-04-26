import React, {useEffect, useState} from 'react';
import classes from './Signup.module.css'
import {CgProfile} from 'react-icons/cg'
import {BsFillPersonFill} from "react-icons/bs";
import {IoPersonCircle} from "react-icons/io5";
import {useNavigate} from "react-router-dom";


const Signup = () => {
    const [formData, setFormData] = useState({
        lastName: '',
        firstName: '',
        email: '',
        position: '',
        password: '',
        repeatedPassword: ''
    })
    const navigate = useNavigate()
    console.log(localStorage.getItem('token'))

    useEffect(() => {
        fetch('http://localhost:4000/isUserAuth', {
            headers: {
                'x-access-token': localStorage.getItem('token')
            }
        }).then(res => res.json()).then(data => data.isLoggedIn ? navigate('/dashboard') : null)
        console.log(localStorage.getItem('token'))
    }, [])

    const onChange = event => {
        setFormData({...formData, [event.target.id]: event.target.value})
    }

    const onSubmit = event => {
        console.log('Submit')
        event.preventDefault()
        fetch('/register', {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(formData)
        }).then(res => res.json()).then(data => {
            localStorage.setItem('token', data.token)
            navigate('/dashboard')
        })

    }

    return (
        <form className={classes.form} onSubmit={event => onSubmit(event)}>
            <IoPersonCircle style={{margin: '0 auto'}} color='#CEDCFF' size={320}/>
            <div className={classes.content__area}>
                <div className={classes.fields__area}>
                     <input type='text'
                            id='lastName'
                            value={formData.lastName}
                            onChange={event => onChange(event)}
                            className={classes.input__field}
                            placeholder='Last name'/>
                    <input type='text'
                           id='firstName'
                           value={formData.firstName}
                           onChange={event => onChange(event)}
                           className={classes.input__field}
                           placeholder='First name'/>
                    <input type='text'
                           id='email'
                           value={formData.email}
                           onChange={event => onChange(event)}
                           className={classes.input__field}
                           placeholder='Email'/>
                    <input type='text'
                           id='phoneNumber'
                           value={formData.phoneNumber}
                           onChange={event => onChange(event)}
                           className={classes.input__field}
                           placeholder='Phone number'/>
                    <input type='text'
                           id='position'
                           value={formData.position}
                           onChange={event => onChange(event)}
                           className={classes.input__field}
                           placeholder='Position'/>
                    <input type='text'
                           id='password'
                           value={formData.password}
                           onChange={event => onChange(event)}
                           className={classes.input__field}
                           placeholder='Password'/>
                    <input type='text'
                           id='repeatedPassword'
                           value={formData.repeatedPassword}
                           onChange={event => onChange(event)}
                           className={classes.input__field}
                           placeholder='Repeat password'/>
                </div>
                <div className={classes.image}>Some photo</div>
            </div>
            <button type='submit' className={classes.btn}>Sign Up</button>
        </form>
    );
};

export default Signup;
