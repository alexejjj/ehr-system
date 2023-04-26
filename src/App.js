import './App.css';
import Sidebar from "./components/UI/sidebar/Sidebar";
import Header from "./components/UI/header/Header";
import AppRouter from "./components/AppRouter";


function App() {
    return (
        <div className="app">
            <Sidebar/>
            <Header/>
            <div className='content'>
                <AppRouter/>
            </div>
        </div>
  );
}

export default App;
