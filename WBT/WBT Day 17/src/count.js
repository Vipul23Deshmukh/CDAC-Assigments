import React,{useState} from "react";


function Count(){
    const [count ,setCount]=useState(0);

    return(

        <div className="Count">
            <h1>Counter </h1>

            <p>count :{count}</p>

            <button onClick={()=> setCount(count+1)}>Increment</button>
            <button onClick={()=> setCount(count-1)}>Decrement</button>
        <button onClick={()=>setCount(0)}>Reset</button>
        </div>
    );
}


export default Count;