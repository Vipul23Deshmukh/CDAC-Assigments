const http = require('http');

http.createServer((req, res) => {
    console.log("Method: " + req.method);

    if (req.method === 'POST') {
        res.write("Post Method Demo");
    }

    if (req.method === 'GET') {
        res.write("GET Method Demo");
    }

    res.end(); // Always end the response
}).listen(4000, () => {
    console.log("Server started on port 4000");
});
