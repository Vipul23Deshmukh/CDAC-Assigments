import React, { useState, useEffect } from 'react';

function Factorial({ number }) {
  const [result, setResult] = useState(null);

  useEffect(() => {
    const calculateFactorial = (num) => {
      if (num < 0) return 'Invalid';
      let fact = 1;
      for (let i = 1; i <= num; i++) {
        fact *= i;
      }
      return fact;
    };
    setResult(calculateFactorial(number));
  }, [number]);

  return (
    <div>
      <h3>Factorial of {number} is: {result}</h3>
    </div>
  );
}

export default Factorial;
