import React,{useState,useEffect} from "react";
function Lifecycle(){
    const[count,setCount]=useState(0);


    useEffect(()=>{
        console.log(" component mounted...");
        return()=>{
            console.log("component will unamount");
        };
    },[]);

    useEffect(()=>{
        if (count!=0)
        {
            console.log("count updated: ",count);

        }
    },[count]);
    return (
        <div>
            <p>Count:{count}</p>
            <button onClick={()=> setCount(count+1)}>increament</button>
        </div>
    );
}
export default Lifecycle;