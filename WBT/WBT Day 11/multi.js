const args = process.argv.slice(2);
const num1 = parseFloat(args[0]);
const num2 = parseFloat(args[1]);


function multiplyIfPositive(a, b) {
  return new Promise((resolve, reject) => {
    if (a > 0 && b > 0) {
      resolve(a * b);
    } else {
      reject("Both numbers must be positive to perform multiplication.");
    }
  });
}

multiplyIfPositive(num1, num2)
  .then(result => {
    console.log(`Multiplication result: ${result}`);
  })
  .catch(error => {
    console.error(`Error: ${error}`);
  });
