import React from 'react';

export default function Calculator({ num1, num2 }) {
  return (
    <div>
      <p>Addition: {num1 + num2}</p>
      <p>Subtraction: {num1 - num2}</p>
      <p>Multiplication: {num1 * num2}</p>
      <p>Division: {num2 !== 0 ? (num1 / num2).toFixed(2) : 'Cannot divide by zero'}</p>
    </div>
  );
}
