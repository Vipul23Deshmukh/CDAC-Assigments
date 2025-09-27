const fs = require('fs');

fs.readFile("sample.txt", "utf8", (err, data) => {
    if (err) {
        console.log("Error occurred: " + err);
    } else {
        console.log(data);
    }
});
