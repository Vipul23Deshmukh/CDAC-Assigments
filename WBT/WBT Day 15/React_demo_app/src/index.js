import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';



import reportWebVitals from './reportWebVitals';
import { Greeting } from './comp';
import { Header } from './comp';
import { Footer } from './comp';
import TextTransformer from './TextTransformer';


import Factorial from './Calculator/Factorial';
import Calculator from './Calculator/Calculator';
import OperationCalculator from './Calculator/OperationCalculator';





const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>

    <Header></Header>
    <Footer></Footer>

    <Greeting name="IET students"></Greeting>
    <TextTransformer></TextTransformer>

   <Factorial number={5} />
    <Calculator num1={10} num2={2} />
    <OperationCalculator num1={10} num2={2} operation="mul" />




    <App />
  </React.StrictMode>
);

// If you want to start measuring performance in your app, pass a function
// to log results (for example: reportWebVitals(console.log))
// or send to an analytics endpoint. Learn more: https://bit.ly/CRA-vitals
reportWebVitals();
