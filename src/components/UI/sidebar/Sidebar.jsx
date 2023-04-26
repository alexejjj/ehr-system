import React, {useState} from 'react';
import classes from './Sidebar.module.css'
import {links} from "../../../data/data";
import {Link} from "react-router-dom";

const Sidebar = () => {
    const [activeTab, setActiveTab] = useState('Dashboard')

    return (
        <section className={classes.sidebar__wrap}>
            <h1 className={classes.sidebar__title}>OpenEHR</h1>
            <ul>
                {
                    links.map(link => (
                        <Link to={`/${link.title.toLowerCase()}`} onClick={() => setActiveTab(link.title)}
                              className={`${activeTab !== link.title ? classes.tab : `${classes.tab} ${classes.tab__active}`}`}>
                            <span style={{marginLeft: '20px'}}>{link.icon}</span>
                            <span>{link.title}</span>
                        </Link>
                    ))
                }
            </ul>
        </section>
    );
};

export default Sidebar;
