import React, {useMemo, useState} from 'react';
import Calendar from "react-calendar";
import classes from './DatePicker.module.css'
import 'react-calendar/dist/Calendar.css';


const DatePicker = ({setIsOpen, handleBirthDate}) => {
    const [date, setDate] = useState(null)

    const onChange = date => {
        handleBirthDate(date)
    }

    return (
        <div className={classes.datepicker}>
            <Calendar onChange={onChange} value={date}/>
            <button type='button' className={classes.save__btn} onClick={() => setIsOpen(false)}>
                Save
            </button>
        </div>
    );
};

export default DatePicker;
