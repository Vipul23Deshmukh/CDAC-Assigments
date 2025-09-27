const nums = process.argv.slice(2).map(Number);

// 1) Sum of even numbers
let sumEven = 0;
for (let n of nums) {
  if (n % 2 === 0) sumEven += n;
}

// 2) Sum of even index numbers
let sumEvenIndex = 0;
for (let i = 0; i < nums.length; i += 2) {
  sumEvenIndex += nums[i];
}

// 3) Sum of prime numbers
function isPrime(n) {
  if (n < 2) return false;
  for (let i = 2; i <= Math.sqrt(n); i++) {
    if (n % i === 0) return false;
  }
  return true;
}

let sumPrimes = 0;
for (let n of nums) {
  if (isPrime(n)) sumPrimes += n;
}

// Output
console.log("Sum of even numbers:", sumEven);
console.log("Sum of even index numbers:", sumEvenIndex);
console.log("Sum of prime numbers:", sumPrimes);
