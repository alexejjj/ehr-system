import React, {useEffect, useState} from 'react';
import classes from './Dashboard.module.css'
import Card from "../../UI/card/Card";
import {MdChildCare} from "react-icons/md";
import {BsFillPersonCheckFill, BsFillPersonFill} from "react-icons/bs";
import {AiOutlineCheck} from "react-icons/ai";
import CustomTable from "../../UI/table/CustomTable";
import CustomPagination from "../../UI/CustomPagination";
import {NodeService} from "../../../API/PatientService";



const Dashboard = () => {
    const headers = ['First Name', 'Last Name', 'Birth Date']
    const cards = [
        {
            title: 'New Patients',
            value: 128,
            icon: <BsFillPersonFill/>,
            chartType: 'area'
        },
        {
            title: 'Recovered Patients',
            value: 52,
            icon: <BsFillPersonCheckFill/>,
            chartType: 'line'
        },
        {
            title: 'Children',
            value: 70,
            icon: <MdChildCare/>,
            chartType: 'bar'
        },
        {
            title: 'Diagnoses',
            value: 21,
            icon: <AiOutlineCheck/>,
            chartType: 'pie'
        },
    ]
    const [data, setData] = useState([])

    useEffect(() => {
        NodeService.getAllDoctorPatients(localStorage.getItem('token')).then(response => setData(response))
    }, [])

    console.log(localStorage.getItem('user'))

    return (
        <div className={classes.dashboard}>
            <div className={classes.cards}>
                {
                    cards.map(card => (
                        <Card title={card.title} value={card.value} icon={card.icon} chartType={card.chartType}/>
                    ))
                }
            </div>
            <div className={classes.table}>
                <CustomTable headers={headers} data={data}/>
            </div>
            <CustomPagination className={classes.pagination}
                              pageSize={6}
                              setData={data => setData(data)}
            />
        </div>
    );
};

export default Dashboard;