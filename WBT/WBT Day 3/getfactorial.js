function getFactorialImpl(choice = "FORLOOP") {
  // Iterative version
  function Fact1(n) {
    let result = 1;
    for (let i = 2; i <= n; i++) {
      result *= i;
    }
    console.log(`Factorial of ${n} using FORLOOP is: ${result}`);
    return result;
  }

  // Recursive version
  function Fact2(n) {
    if (n === 0 || n === 1) return 1;
    return n * Fact2(n - 1);
  }

  if (choice === "RECUR") {
    return function(n) {
      const result = Fact2(n);
      console.log(`Factorial of ${n} using RECUR is: ${result}`);
      return result;
    };
  } else {
    return Fact1;
  }
}

// 🧪 Test calls
let rv = getFactorialImpl("RECUR");
rv(3); // Output: Factorial of 3 using RECUR is: 6

rv = getFactorialImpl(); // Defaults to FORLOOP
rv(5); // Output: Factorial of 5 using FORLOOP is: 120
