import React, { useState } from 'react';
import axios from 'axios';

const JsonTable = () => {
  const [data, setData] = useState([]);
  const [headers, setHeaders] = useState([]);

  const fetchData = async () => {
    try {
      const response = await axios.get('https://jsonplaceholder.typicode.com/users'); // Replace with your JSON URL
      const json = response.data;

      if (json.length > 0) {
        setHeaders(Object.keys(json[0]));
        setData(json);
      }
    } catch (error) {
      console.error('Axios error:', error);
    }
  };

  return (
    <div style={{ padding: '20px', fontFamily: 'Arial, sans-serif' }}>
      <h2>📊 JSON Data Table</h2>
      <button
        onClick={fetchData}
        style={{
          padding: '8px 16px',
          fontSize: '16px',
          cursor: 'pointer',
          marginBottom: '12px',
        }}
      >
        Load Data
      </button>

      {data.length > 0 && (
        <table
          style={{
            width: '100%',
            borderCollapse: 'collapse',
            marginTop: '10px',
          }}
        >
          <thead>
            <tr>
              {headers.map((header) => (
                <th
                  key={header}
                  style={{
                    border: '1px solid #ccc',
                    padding: '8px',
                    backgroundColor: '#f4f4f4',
                    textAlign: 'left',
                  }}
                >
                  {header}
                </th>
              ))}
            </tr>
          </thead>
          <tbody>
            {data.map((item, idx) => (
              <tr key={idx}>
                {headers.map((header) => (
                  <td
                    key={header}
                    style={{
                      border: '1px solid #ccc',
                      padding: '8px',
                      textAlign: 'left',
                    }}
                  >
                    {typeof item[header] === 'object'
                      ? JSON.stringify(item[header])
                      : item[header]}
                  </td>
                ))}
              </tr>
            ))}
          </tbody>
        </table>
      )}
    </div>
  );
};

export default JsonTable;
