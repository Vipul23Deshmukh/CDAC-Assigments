const express = require('express');
const users1=require('./MOCK_DATA.json');
const port=4040;
const app= express();

app.get('/',(req,res)=>{
    res.send("this is express js");
});

app.get('/user',(req,res)=>{
    res.json(users1);
});

app.get('/users/:id/:email',(req,res)=>{
    const id=Number(req.params.id);

    const user=users1.find(
        user=>user.id===id
    )
  return res.json(user);
});

app.post('/users',(req,res)=>{
      res.send("POST request received");
});


app.listen(port)

console.log("from start script");