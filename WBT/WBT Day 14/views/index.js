const express = require('express');
const bodyParser = require('body-parser');
const path = require('path');
const app = express();
const port = 3000;

// Set view engine
app.set('view engine', 'hbs');
app.set('views', path.join(__dirname, 'views'));

// Middleware
app.use(bodyParser.urlencoded({ extended: false }));

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
  console.log(`Server running at http://localhost:${3000}`);
});
