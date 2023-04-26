import React, {useEffect, useMemo, useState} from 'react'
import {useTable} from "react-table"
import classes from './Patients.module.css'
// import Pagination from "../../pagination/Pagination";
// import Pagination from "react-bootstrap-4-pagination";
// import Pagination from 'react-bootstrap/Pagination';
import {Pagination} from "@mui/material";
import {useNavigate} from 'react-router-dom'
import axios from "axios";


const Patients = () => {

    const data = useMemo(() => ([
        {
            id: 0,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 1,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 2,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 3,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 4,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 5,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 6,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 7,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 8,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 9,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 10,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 11,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 12,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 13,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 14,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 15,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnosssss'
        },
        {
            id: 16,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 17,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 18,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 19,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 20,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 21,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 22,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 23,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 24,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 25,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 26,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 27,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 28,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 29,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 30,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 31,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnosssss'
        },
        {
            id: 32,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 33,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 34,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 35,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 36,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 37,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 38,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 39,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 40,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 41,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 42,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 43,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 44,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 45,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 46,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 47,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnosssss'
        },
        {
            id: 48,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 49,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 50,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 51,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 52,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 53,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 54,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 55,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 56,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 57,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 58,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 59,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 60,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 61,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 62,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnos'
        },
        {
            id: 63,
            name: 'Ivan Dmitriev',
            email: 'ivan@gmail.com',
            visitDate: '20.11.2021',
            visitTime: '10:15-10:45am',
            nextVisit: '20.12.2021',
            diagnos: 'Diagnosssss'
        }
    ]), [])

    const columns = useMemo(() => ([
        {
            Header: 'Name',
            accessor: 'name'
        },
        {
            Header: 'Email',
            accessor: 'email'
        },
        {
            Header: 'Visit Date',
            accessor: 'visitDate'
        },
        {
            Header: 'Visit Time',
            accessor: 'visitTime'
        },
        {
            Header: 'Next Visit',
            accessor: 'nextVisit'
        },
        {
            Header: 'Diagnos',
            accessor: 'diagnos'
        }
    ]), [])

    const apiKey = `Basic ${process.env.AUTH_EHRBASE}`
    useEffect(() => {
        const loadPatients = async () => {
            const response = await axios({
                url: 'http://localhost:8010/proxy/ehrbase/rest/openehr/v1/status',
                method: 'get',
                headers: {authorization: apiKey, contentType: 'application/json',  accept: 'application/json'}
            })
            console.log(response.data)
        }
        loadPatients()
    }, [])

    const {getTableProps, getTableBodyProps, headerGroups, rows, prepareRow} = useTable({columns, data})
    const pageSize = 8
    const [currentPage, setCurrentPage] = useState(1)
    const currentTableData = useMemo(() => {
        const firstPageIndex = (currentPage - 1) * pageSize
        const lastPageIndex = firstPageIndex + pageSize
        return data.slice(firstPageIndex, lastPageIndex)
    }, [currentPage])
    const navigate = useNavigate()

    return (
        <div className={classes.patients}>
            <h1 className={classes.patients__title}>Patients</h1>
            <div className={classes.table__block}>
                <table className={classes.table} {...getTableProps()}>
                    <thead className={classes.table__header}>
                        {
                            headerGroups.map(headerGroup => (
                                <tr className={classes.header__row} {...headerGroup.getHeaderGroupProps()}>
                                    {
                                        headerGroup.headers.map(column => (
                                            <th className={classes.header__item} {...column.getHeaderProps()}>
                                                {column.render('Header')}
                                            </th>
                                        ))
                                    }
                                </tr>
                            ))
                        }
                    </thead>
                    <tbody className={classes.table__body} {...getTableBodyProps()}>
                        {
                            currentTableData.map(item => {
                                return (
                                  <tr className={classes.row} onClick={() => navigate(`/patients/${item.id}`)}>
                                      <td className={classes.item}>{item.name}</td>
                                      <td className={classes.item}>{item.email}</td>
                                      <td className={classes.item}>{item.visitDate}</td>
                                      <td className={classes.item}>{item.visitTime}</td>
                                      <td className={classes.item}>{item.nextVisit}</td>
                                      <td className={classes.item}>{item.diagnos}</td>
                                  </tr>
                                );
                            })
                        }
                    </tbody>
                </table>
                <hr className={classes.table__line}/>
                <Pagination className={classes.pagination}
                            currentPage={currentPage}
                            totalCount={data.length}
                            pageSize={pageSize}
                            onPageChange={page => setCurrentPage(page)}
                />
            </div>
        </div>
    );
};

export default Patients;
