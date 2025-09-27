import React, { useState } from 'react';


function Calculator({ num1, num2 }) {
  const [results, setResults] = useState({});

  React.useEffect(() => {
    setResults({
      addition: num1 + num2,
      subtraction: num1 - num2,
      multiplication: num1 * num2,
      division: num2 !== 0 ? (num1 / num2).toFixed(2) : 'Cannot divide by zero',
    });
  }, [num1, num2]);

  return (
    <div>
      <h3>Calculator Results:</h3>
      <p>Addition: {results.addition}</p>
      <p>Subtraction: {results.subtraction}</p>
      <p>Multiplication: {results.multiplication}</p>
      <p>Division: {results.division}</p>
    </div>
  );
}

export default Calculator;
