var http = require("http");
var fs = require("fs");
const port = 3000;
http
  .createServer((req, res) => {
    // res.write("Hello world"));

    // res.write(req.url);
    // res.end();
    // console.log(`server is running on port ${port}`);
    fs.readFile("Packages.java", (err, data) => {
      res.write(data);
      res.end();
    });
  })
  .listen(port);
