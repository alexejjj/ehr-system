import React from 'react'
import {Route, Routes} from 'react-router-dom'
import Dashboard from "./pages/dashboard/Dashboard";
import Patients from "./pages/patients/Patients";
import Patient from "./pages/patient/Patient";
import NewPatientForm from "./pages/form/NewPatientForm";
import Signup from "./pages/login/Signup";
import Login from "./pages/login/Login";
import ProfilePage from "./pages/profilepage/ProfilePage";
import {AuthRequire} from "../contexts/UserContext";


const AppRouter = () => {
    return (
        <Routes>
            <Route exact path='/dashboard' element={<AuthRequire><Dashboard/></AuthRequire>}/>
            <Route exact path='/patients' element={<AuthRequire><Patients/></AuthRequire>}/>
            <Route exact path='/new' element={<AuthRequire><NewPatientForm/></AuthRequire>}/>
            <Route exact path='/patients/:id' element={<AuthRequire><Patient/></AuthRequire>}/>
            <Route exact path='/user/:userId' element={<AuthRequire><ProfilePage/></AuthRequire>}/>
            <Route exac path='/signup' element={<Signup/>}/>
            <Route exact path='/login' element={<Login/>}/>
        </Routes>
    );
};

export default AppRouter;
