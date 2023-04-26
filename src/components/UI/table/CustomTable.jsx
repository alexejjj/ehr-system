import React from 'react';
import {Table, TableContainer, TableHead, TableBody, TableRow, TableCell, Paper} from "@mui/material";
import {useNavigate} from "react-router-dom";


const CustomTable = ({headers, data}) => {
    const navigate = useNavigate()

    return (
        <TableContainer component={Paper} sx={{maxHeight: '425px',
                                               width: '95%',
                                               margin: '0 auto',
                                               boxShadow: '0 4px 4px rgba(0, 0, 0, 0.25)',
                                               backdropFilter: 'blur(4px)',
                                               borderRadius: '10px'}}
        >
            <Table aria-label='simple table' stickyHeader>
                <TableHead sx={{backgroundColor: '#E8E8E8'}}>
                    <TableRow>
                        {
                            headers.map(header => (
                                <TableCell sx={{backgroundColor: '#E8E8E8'}}>{header}</TableCell>
                            ))
                        }
                    </TableRow>
                </TableHead>
                <TableBody>
                    {
                        data.map(row => (
                            <TableRow key={row.id}
                                      onClick={() => navigate(`/patients/${row.ehrId}`)}
                                      sx={{'&:last-child td, &:last-child th': {border: 0},
                                          cursor: 'pointer',
                                          ":hover": {backgroundColor: '#CEDCFF',
                                                     transitionDuration: '0.5s'}}}>
                                <TableCell>{row.firstName}</TableCell>
                                <TableCell>{row.lastName}</TableCell>
                                <TableCell>{row.birthDate}</TableCell>
                            </TableRow>
                        ))
                    }
                </TableBody>
            </Table>
        </TableContainer>
    );
};

export default CustomTable;