import React, { useState } from 'react';

const PasswordGenerator = () => {
  const [length, setLength] = useState(8);
  const [password, setPassword] = useState('');

  const generatePassword = () => {
    const chars =
      'ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+-=[]{}|;:,.<>?';
    let newPassword = '';
    for (let i = 0; i < length; i++) {
      const randomIndex = Math.floor(Math.random() * chars.length);
      newPassword += chars[randomIndex];
    }
    setPassword(newPassword);
  };

  return (
    <div>
      <h2>Random Password Generator</h2>

      <label>
        Password Length:
        <input
          type="number"
          value={length}
          onChange={(e) => setLength(Number(e.target.value))}
          min="4"
          max="32"
        />
      </label>

      <br /><br />

      <button onClick={generatePassword}>Generate Password</button>

      <br /><br />

      {password && (
        <div>
          <strong>Your Password:</strong> {password}
        </div>
      )}
    </div>
  );
};

export default PasswordGenerator;
