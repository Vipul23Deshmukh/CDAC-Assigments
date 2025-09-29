import React, { useState, useEffect } from "react";

function Count() {
  const [count, setCount] = useState(0);
  const [tableData, setTableData] = useState([]);

  useEffect(() => {
    // Only add to table if incremented
    if (tableData.length === 0 && count === 0) return;
    if (tableData.length === 0 && count !== 0) {
      setTableData([count]);
    } else if (count > (tableData[tableData.length - 1] || 0)) {
      setTableData([...tableData, count]);
    }
    // Do not add on decrement or reset
  }, [count]);

  return (
    <div className="Count">
      <h1>Counter</h1>
      <p>count : {count}</p>
      <button onClick={() => setCount(count + 1)}>Increment</button>
      <button onClick={() => setCount(count - 1)}>Decrement</button>
      <button onClick={() => setCount(0)}>Reset</button>

      {tableData.length > 0 && (
        <table border="1" style={{ marginTop: '20px' }}>
          <thead>
            <tr>
              <th>Incremented Value</th>
            </tr>
          </thead>
          <tbody>
            {tableData.map((val, idx) => (
              <tr key={idx}>
                <td>{val}</td>
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
}

export default Count;