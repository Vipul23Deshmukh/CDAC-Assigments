const express = require('express');
const fs = require('fs');
const path = require('path');
const app = express();
const port = 3000;

// Middleware
app.use(express.json());
app.use(express.static(path.join(__dirname, 'public')));

// Load user data
let users = require('./MOCK_DATA.json');



// GET all users
app.get('/users', (req, res) => {
  res.json(users);
});


// Serve aboutus.html
app.get('/users/aboutus', (req, res) => {
  res.sendFile(path.join(__dirname, 'public', 'aboutus.html'));
});

// GET user by ID
app.get('/users/:id', (req, res) => {
  const id = Number(req.params.id);
  const user = users.find(u => u.id === id);
  if (!user) return res.status(404).send("User not found");
  res.json(user);
});

// GET user by ID and email
app.get('/users/:id/:email', (req, res) => {
  const { id, email } = req.params;
  const user = users.find(u => u.id === Number(id) && u.email === email);
  if (!user) return res.status(404).send("User not found");
  res.json(user);
});

// POST new user
app.post('/users', (req, res) => {
  const newUser = req.body;

  if (!newUser.id || !newUser.first_name || !newUser.email) {
    return res.status(400).json({ error: 'Missing required fields' });
  }

  users.push(newUser);
  fs.writeFileSync('./MOCK_DATA.json', JSON.stringify(users, null, 2));
  res.status(201).json({ message: 'User created', user: newUser });
});

// PUT update user
app.put('/users/:id', (req, res) => {
  const id = Number(req.params.id);
  const updatedData = req.body;
  const index = users.findIndex(u => u.id === id);

  if (index === -1) return res.status(404).json({ error: 'User not found' });

  users[index] = { ...users[index], ...updatedData };
  fs.writeFileSync('./MOCK_DATA.json', JSON.stringify(users, null, 2));
  res.json({ message: 'User updated', user: users[index] });
});

// DELETE user
app.delete('/users/:id', (req, res) => {
  const id = Number(req.params.id);
  const index = users.findIndex(u => u.id === id);

  if (index === -1) return res.status(404).send("User not found");

  users.splice(index, 1);
  fs.writeFileSync('./MOCK_DATA.json', JSON.stringify(users, null, 2));
  res.send(`User with ID ${id} deleted`);
});


// Set view engine
app.set('view engine', 'hbs');
app.set('views', path.join(__dirname, 'views'));

// Middleware
app.use(express.urlencoded({ extended: false }));


// GET /calc - Show calculator form
app.get('/calc', (req, res) => {
  res.render('calc');
});

// POST /calc - Process form and show result
app.post('/calc', (req, res) => {
  const num1 = Number(req.body.num1);
  const num2 = Number(req.body.num2);
  const result = num1 + num2;

  res.render('calc', { result });
});

// Start server
app.listen(port, () => {
  console.log(`Server running at http://localhost:${port}`);
});


