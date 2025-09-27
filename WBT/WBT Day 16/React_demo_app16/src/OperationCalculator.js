import React, { useState, useEffect } from 'react';

function OperationCalculator({ num1, num2, operation }) {
  const [result, setResult] = useState(null);

  useEffect(() => {
    switch (operation) {
      case 'add':
        setResult(num1 + num2);
        break;
      case 'subtract':
        setResult(num1 - num2);
        break;
      case 'multiply':
        setResult(num1 * num2);
        break;
      case 'divide':
        setResult(num2 !== 0 ? (num1 / num2).toFixed(2) : 'Cannot divide by zero');
        break;
      default:
        setResult('Invalid operation');
    }
  }, [num1, num2, operation]);

  return (
    <div>
      <h3>{operation.toUpperCase()} Result: {result}</h3>
    </div>
  );
}

export default OperationCalculator;
