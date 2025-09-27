const fs = require('fs');

const content = "Hello World";

fs.writeFile("sample.txt", content, "utf8", (err) => {
  if (err) {
    console.log("Error writing file:", err);
  } else {
    console.log("File written successfully!");
  }
});
