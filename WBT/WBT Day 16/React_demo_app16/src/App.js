
import React from 'react';
import Factorial from './Factorial';
import Calculator from './Calculator';
import OperationCalculator from './OperationCalculator';
//import Counter from './Counter';
import LifecycleDemo from './LifecycleDemo';




import TextTransformer from './TextTransformer';



import UserDetails from './Userdetails';


import GraduateComponet from './GraduateComponent'


function App() {
  return (
    <div style={{ padding: '20px', fontFamily: 'Arial' }}>
      <h2>React Function Components Demo</h2>
      <Factorial number={5} />
      <Calculator num1={10} num2={2} />
      <OperationCalculator num1={10} num2={2} operation="multiply" />
    
      <LifecycleDemo></LifecycleDemo>
      <TextTransformer />
     
     
     
      <UserDetails/>
    

    </div>
    
  );
}

export default App;
