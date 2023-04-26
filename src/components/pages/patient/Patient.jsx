import React, {useEffect, useMemo, useState} from 'react';
import classes from './Patient.module.css'
import {Pagination} from "@mui/material";
import {useParams} from "react-router-dom";
import PatientService, {NodeService} from "../../../API/PatientService";


const Patient = () => {

    const {id} = useParams()
    const [compositions, setCompositions] = useState([{}])
    const [currentComposition, setCurrentComposition] = useState(0)
    const [patient, setPatient] = useState({})



    useEffect(() => {
        PatientService.getAllPatientCompositions(id).then(response => {
            const keys = response.data.columns.map(name => name.name)
            const valuesArrays = response.data.rows
            let result = []
            valuesArrays.forEach((values, idx) => {
                result.push({})
                keys.forEach((key, i) => result[idx][key] = values[i])
            })
            setCompositions(result)
        })
        NodeService.getPatientByEhr(id).then(response => {
            console.log(response)
            setPatient(response)
        })
    }, [])


    const handlePageChange = (event, page) => {
        setCurrentComposition(page - 1)

    }

    return (
        <div className={classes.patient}>
            <div className={classes.patient__header}>
                <div className={classes.name}>
                    {patient.firstName} {patient.lastName}
                </div>
                <div className={classes.date}>
                    10.11.2021
                </div>
            </div>
            <div className={classes.content__area}>
                {
                    Object.keys(compositions[currentComposition]).map(key => (
                        <div>
                            {
                                key === 'photo' ? <img src={`data:image/png;base64,${compositions[currentComposition][key]}`}/>:
                                    <div className={classes.item}>
                                        <div className={classes.title}>{key}</div>
                                        <div className={classes.value}>{compositions[currentComposition][key]}</div>
                                    </div>
                            }
                        </div>
                    ))
                }
            </div>
            <Pagination className={classes.pagination}
                        count={compositions.length}
                        onChange={handlePageChange}
                        variant='outlined'
                        shape='rounded'
                        sx={{'.css-19xm0h7-MuiButtonBase-root-MuiPaginationItem-root.Mui-selected': {
                                '&hover': {
                                    backgroundColor: 'none',
                                },
                                backgroundColor: '#336CFB',
                                color: '#FFF'
                            }
                        }}
            />
        </div>
    );
};

export default Patient;
