import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
// import App from './App';
import reportWebVitals from './reportWebVitals';
import { EcomLogin } from './EcomLogin';
// import { MainPage } from './Ecartmain';
// import { Compute } from './Compute';
// import { Sample } from './App1';
// import { Clock } from './Clock';
// import { Effect } from './Effecthook';
// import { Dependency } from './Dependency';
// import { LoginValidation } from './LoginValidation';
// import { Loginhook } from './Loginhook';
// import { Onchangeevent } from './Onchangeevent';
// import { Signin } from './Signin';
// import { Myrouting } from './Myrouting';
// import { Frontendlog } from './Frontendlog';
// import { Multi } from './Multi';
// import { LoginforSpringBoot } from './LoginforSpringBoot';
// import { FrontBackend } from './FrontBackend';
import { Tasklogin } from './Tasklogin';
import { Tasksignup } from './Tasksignup';
// import { Taskhome } from './Taskhome';
// import { MainPage } from './Ecartmain';
const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    {/* <App /> */}
    {/* <Compute /> */}
    {/* <Sample /> */}
    {/* <Clock /> */}
    {/* <Effect /> */}
    {/* <Dependency /> */}
    {/* <LoginValidation /> */}
    {/* <Loginhook /> */}
    {/* <Onchangeevent /> */}
    {/* <Myrouting /> */}
    {/* <Frontendlog /> */}
    {/* <Multi /> */}
    {/* <LoginforSpringBoot /> */}
    {/* <FrontBackend /> */}
    {/* <Taskhome /> */}
    {/* <Tasklogin /> */}
    <EcomLogin />
    {/* <Tasksignup /> */}
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
