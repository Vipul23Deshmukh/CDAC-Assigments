const express = require('express');
const app = express();
const port = 4040;

app.get('/', (req, res) => {
  res.send('Hello from Express!');
});

app.listen(port, () => {
  console.log(`Server running at http://localhost:${4040}`);
});
