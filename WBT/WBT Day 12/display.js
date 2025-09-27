const http=require('http');
const url=require('url');
const server=http.createServer((req,res)=>{
    const queryObject=url.parse(req.url,true).query;
    const fname=queryObject.fname || 'Guest';

    res.writeHead(200,{'content-type':'text/html'});
    res.end(`<htmll><body><h1>${fname}</h1></body></htmll>`);
});


server.listen(3000,()=>{
    console.log('server running....');
});