import React from 'react';

export default function OperationCalculator({ num1, num2, operation }) {
  const calculate = () => {
    switch (operation) {
      case 'add': return num1 + num2;
      case 'sub': return num1 - num2;
      case 'mul': return num1 * num2;
      case 'div': return num2 !== 0 ? (num1 / num2).toFixed(2) : 'Cannot divide by zero';
      default: return 'Invalid operation';
    }
  };

  return <p>{operation.toUpperCase()} result: {calculate()}</p>;
}
