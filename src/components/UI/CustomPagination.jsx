import React from 'react';
import {useEffect, useState} from "react";
import {Pagination} from "@mui/material";
import {NodeService} from "../../API/PatientService";


const service = {
    getPatients: (from, to) => {
        return new Promise((resolve, reject) => {
            let fullData = []
            NodeService.getAllDoctorPatients(localStorage.getItem('token')).then(response => fullData = response)
            const data = fullData.slice(from, to)
            resolve({
                count: fullData.length,
                data: data
            })
        })
    }
}


const CustomPagination = ({className, pageSize, setData}) => {
    const [pagination, setPagination] = useState({
        from: 0,
        to: pageSize,
        count: 0
    })

    useEffect(() => {
        service.getPatients(pagination.from, pagination.to).then(response => {
            setPagination({...pagination, count: response.count})
            setData(response.data)
        })
    }, [pagination.from, pagination.to])

    const handlePageChange = (event, page) => {
        const from = (page - 1) * pageSize
        const to = (page - 1) * pageSize + pageSize
        setPagination({...pagination, from: from, to: to})
    }

    return (
        <Pagination className={className}
                        count={Math.ceil(pagination.count / pageSize)}
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
    );
};

export default CustomPagination
