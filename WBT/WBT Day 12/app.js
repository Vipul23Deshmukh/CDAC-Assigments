const express = require('express');
const app = express();


const todos=[
    {id: 1, task:"buy groceries"},
    {id: 2, task:"walk the dogds"},
    {id: 3, task: "finish HW"}
];
app.get('/', (req, res) => {
  res.send('<h1>Welcome to the Todo App</h1><p>Try visiting <a href="/todos">/todos</a></p>');
});

app.get('/todos', (req, res) => {
  res.json(todos);
});
app.get('/todos/:id',(req,res)=>{

    const todoID= parseInt(req.params.id);
    const todo =todos.find(t =>t.id===todoID)

    
  if (todo) {
    res.send(`<h1>Todo #${todo.id}</h1><p>${todo.task}</p>`);
  } else {
    res.status(404).send(`<h1>Todo not found</h1>`);
  }
});

// Start the server
app.listen(3000, () => {
  console.log('Server running at http://localhost:3000');
});