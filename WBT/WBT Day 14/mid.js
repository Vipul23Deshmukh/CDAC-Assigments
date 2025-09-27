const express=require('express');
const app=express();
const port=3000;


app.use((req,res,next) => {

    req.requestTime = new Date().toLocaleString();
    
    console.log(`Request received at ${req.requestTime}`);
    next();
});

app.get('/info',(req,res)=>{
    res.send(`request is made at ${req.requestTime}`);
});


app.listen(port,()=>
{
    console.log(`server running at http://localhost:3000`);
})