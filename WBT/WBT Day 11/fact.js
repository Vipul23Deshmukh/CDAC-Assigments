// Recursive factorial function
function factorial(n) {
  if (n < 0) {
    throw new Error("Factorial is not defined for negative numbers.");
  }
  if (n === 0 || n === 1) {
    return 1;
  }
  return n * factorial(n - 1);
}

// Get number from command-line arguments
const args = process.argv.slice(2);
const input = parseInt(args[0]);

if (isNaN(input)) {
  console.log("Please provide a valid number as a command-line argument.");
} else {
  try {
    const result = factorial(input);
    console.log(`Factorial of ${input} is ${result}`);
  } catch (error) {
    console.error(error.message);
  }
}
