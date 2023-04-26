import {createContext, useContext, useEffect, useState} from "react";
import {Navigate, useLocation, useNavigate} from "react-router-dom";

const authContext = createContext(null)

export const useAuth = () => {
    const [authed, setAuthed] = useState(false)
    return {
        authed,
        login(token, user) {
            return new Promise(res => {
                setAuthed(true)
                localStorage.setItem('user', user)
                localStorage.setItem('token', token)
                res()
            })
        },
        logout() {
            return new Promise(res => {
                setAuthed(false)
                localStorage.removeItem('user')
                localStorage.removeItem('token')
                res()
            })
        }
    }
}


export const AuthProvider = ({children}) => {
    const auth = useAuth()

    return (
        <AuthProvider value={auth}>
            {children}
        </AuthProvider>
    )
}

export const AuthConsumer = () => {
    return useContext(authContext)
}

export const AuthRequire = ({children}) => {
    return children

}
