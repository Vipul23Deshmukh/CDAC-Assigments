// Import prompt-sync for terminal input
const prompt = require('prompt-sync')({ sigint: true });

// Sample array
const arr = [5, 2, 9, 1, 7];

console.log("Array Operations Menu:");
console.log("1. Sort Array");
console.log("2. Reverse Array");
console.log("3. Find Maximum");
console.log("4. Find Minimum");
console.log("5. Sum of Elements");

const choice = parseInt(prompt("Enter your choice (1-5): "));

switch (choice) {
  case 1:
    arr.sort((a, b) => a - b);
    console.log("Sorted Array:", arr);
    break;

  case 2:
    arr.reverse();
    console.log("Reversed Array:", arr);
    break;

  case 3:
    console.log("Maximum Element:", Math.max(...arr));
    break;

  case 4:
    console.log("Minimum Element:", Math.min(...arr));
    break;

  case 5:
    const sum = arr.reduce((acc, val) => acc + val, 0);
    console.log("Sum of Elements:", sum);
    break;

  default:
    console.log("Invalid choice!");
}
