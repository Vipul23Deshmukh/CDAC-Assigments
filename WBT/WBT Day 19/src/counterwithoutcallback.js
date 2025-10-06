import React,{useState} from "react";

const funset=new Set();

function Democallback(){
    const [cnt,setcnt]=useState(0);
    const [num,setnum]=useState(0);


    const incnt = () =>setcnt(cnt+1);
    const decnt = () =>setcnt(cnt-1);
    const innum= () =>setnum(num+1);

    funset.add(incnt);
    funset.add(decnt);
    funset.add(innum);


    return(
        <div>
            <h2>Without callback hook</h2>

            <button onClick={incnt}>Increament counter</button>
            <button onClick={decnt}>Decreament counter</button>
            <button onClick={innum}>Increament number</button>

           <h1>Counter:{cnt}</h1>
           <h1>Number:{num}</h1>
           <h1>Function size:{funset.size}</h1>
        </div>
    );
};
export default Democallback;