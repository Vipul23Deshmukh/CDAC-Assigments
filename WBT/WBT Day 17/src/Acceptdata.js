import React,{useState} from "react";
function Acceptdata(){

    const[input ,setinput]=useState("");
    const [list,setlist]=useState([]);


        
  const handleBlur=()=>{
    if (input.trim()!==""){
        setlist([...list,input]);
        setinput("");
    }
  };


  return(
    <div>
        <h2>Enter the data</h2>
        <input type="text" 
        value={input}
         onChange={e =>setinput(e.target.value) }
         onBlur={handleBlur}
          placeholder="type "></input> 


        {list.length>0 &&(
            <ol>
                {list.map ((item,idx)=>(

                    <li key={idx}>{item}</li>
                ))}
            </ol>
        )}
    </div>
  );
}

export default Acceptdata;