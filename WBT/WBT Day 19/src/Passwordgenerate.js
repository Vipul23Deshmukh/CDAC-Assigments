import React,{useState,useCallback,useEffect} from "react";

function Passwordgenerator(){
    
    const[password,setpassword]=useState('');
    const [length,setlength]=useState(12);
    const[includenumbers,setnumbers]=useState(false);
    const[includesymbols,setsymbols]=useState(false);


    const generatepassword = () =>{
        let characters='ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz';
        if(includenumbers) characters+='1234567890';
        if(includesymbols) characters+='@!#$%&*';

        let newpassword='';

        for(let i=0;i<=length;i++)
        {
            newpassword +=characters.charAt(Math.floor(Math.random()*characters.length));

            
        }
        setpassword(newpassword);
    };
      
        useEffect(()=>{ generatepassword() },
        [length,includenumbers,includesymbols])


        useCallback(()=>{ generatepassword()},
        [length,includenumbers,includesymbols])


        const copytoclipboard=()=>{
            navigator.clipboard.writeText('password');
            alert("password copied to clipboard");
        };

        return(
            <div class="password-generator">
             <h1 >Random Password Generator</h1>
             <div>
                <label>Password Length</label>
                <input type="number" value={length} onChange={(e)=>setlength(parseInt(e.target.value))}
                min='1'
                max='32'
                />


             </div>

             <div>
                <label>
                    <input type="checkbox" checked={includenumbers} 
                    onChange={()=>setnumbers(!includenumbers)}/>Include Numbers
                </label>
             </div>

             <div>
                <label>
                    <input type="checkbox" checked={includesymbols}
                    onChange={()=>setsymbols(!includesymbols)}/>Include Symbols
                </label>
             </div>
              <button onClick={generatepassword}>Generate Password</button>
             <div>
                <input type="text" value={password} readOnly></input>
                <button onClick={copytoclipboard}>Copy password</button>

             </div>
            </div>
        );
        
    



}
export default Passwordgenerator;