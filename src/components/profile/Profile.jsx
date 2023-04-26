import React, {useEffect, useState} from 'react';
import {Box, Button, ClickAwayListener, Container, Menu, MenuItem, MenuList, Paper, Popper, Stack} from "@mui/material";
import {IoMdArrowDropdown, IoMdArrowDropup} from "react-icons/io";
import classes from './Profile.css'
import {AiOutlineClose} from "react-icons/ai";
import {MdOutlineLogout} from "react-icons/md";
import {useNavigate} from "react-router-dom";
import {useAuth} from "../../contexts/UserContext";

const Profile = ({user}) => {
    const [menuOpen, setMenuOpen] = useState(false);
    const [anchorEl, setAnchorEl] = useState()
    const navigate = useNavigate()
    const {logout} = useAuth()
    const handleLogout = () => {
        logout().then(() => navigate('/login'))
    }

    const recordButtonPosition = (event) => {
        setAnchorEl(event.currentTarget);
        setMenuOpen(true);
    }

    let closeMenu = () => {
        setMenuOpen(false);
    }

    return (
        <React.Fragment>
            <Box sx={{backgroundColor: 'transparent', transition: '1s', ":&hover": {backgroundColor: 'transparent !important'}}}>
                <Button onClick={recordButtonPosition}>
                    <span style={{color: 'black'}}>Hi, <span style={{fontWeight: '800'}}>{user.firstName}</span></span>
                    {
                        menuOpen
                            ? <IoMdArrowDropup style={{color: 'black', width: '40px'}}/>
                            : <IoMdArrowDropdown style={{color: 'black', width: '40px'}}/>}
                </Button>
                <Menu
                    PaperProps={{
                        style: {
                            width: '400px',
                            borderRadius: '10px',
                            backdropFilter: 'blur(4px)',
                            boxShadow: '0 4px 4px rgba(0, 0, 0, 0.25)'
                        }
                    }}
                    anchorEl={anchorEl}
                    open={menuOpen}
                    onClose={closeMenu}>
                    <MenuItem sx={{display: 'flex', flexDirection: 'column', height: '300px'}} onClick={closeMenu}>
                        <Container sx={{display: 'flex', justifyContent: 'space-between'}}>
                            <span style={{fontSize: '30px'}}>User Profile</span>
                        </Container>
                        <Container sx={{display: 'flex', marginTop: '50px', alignItems: 'center'}}>
                            <div style={{width: '100px',
                                         height: '100px',
                                         backgroundColor: '#A0A4A8',
                                         borderRadius: '50%',
                                         alignSelf: 'center'}}>

                            </div>
                            <Container sx={{display: 'flex', flexDirection: 'column', width: '50%'}}>
                                <span style={{fontSize: '20px', fontWeight: '800'}}>{user.firstName} {user.lastName}</span>
                                <span style={{color: '#A0A4A8'}}>{user.position}</span>
                                <span style={{color: '#A0A4A8', fontWeight: '600'}}>{user.email}</span>
                            </Container>
                        </Container>
                    </MenuItem>
                    <hr style={{opacity: '0.25'}}/>
                    <MenuItem style={{ marginTop: '10px',
                                       height: '50px',
                                       backgroundColor: '#336CFB',
                                       color: '#fff',
                                       borderRadius: '25px', display: 'flex', justifyContent: 'center'}} onClick={closeMenu}>
                        <MdOutlineLogout size={25}/>
                        <span onClick={() => handleLogout()} style={{marginLeft: '10px', fontWeight: '600'}}>Logout</span>
                    </MenuItem>
                </Menu>
            </Box>
        </React.Fragment>
    );
};

export default Profile;