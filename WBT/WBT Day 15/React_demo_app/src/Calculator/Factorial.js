import React from 'react';

export default function Factorial({ number }) {
  const factorial = (n) => {
    if (n < 0) return 'Invalid';
    let fact = 1;
    for (let i = 1; i <= n; i++) {
      fact *= i;
    }
    return fact;
  };

  return <p>Factorial of {number} is {factorial(number)}</p>;
}
