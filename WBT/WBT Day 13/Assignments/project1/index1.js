const express = require('express');
const fs = require('fs');
const app = express();
const port = 3000;

app.use(express.json());

let users = require('./MOCK_DATA.json');


app.get('/users', (req, res) => {
  res.json(users);
});


app.get('/users/:id', (req, res) => {
  const id = Number(req.params.id);
  const user = users.find(u => u.id === id);
  if (!user) return res.status(404).send("User not found");
  res.json(user);
});


app.get('/users/:id/:email', (req, res) => {
  const { id, email } = req.params;
  const user = users.find(u => u.id === Number(id) && u.email === email);
  if (!user) return res.status(404).send("User not found");
  res.json(user);
});


app.delete('/users/:id', (req, res) => {
  const id = Number(req.params.id);
  const index = users.findIndex(u => u.id === id);
  if (index === -1) return res.status(404).send("User not found");
   return res.json("Dae ");

  users.splice(index, 1); 
  res.send(`User with ID ${id} deleted`);
});

app.listen(port, () => {
  console.log(`Server running at http://localhost:${3000}`);
});



