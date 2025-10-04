import React, { useState } from 'react';
import './App.css';

function LoginForm() {
  const [formData, setFormData] = useState({ username: '', password: '' });
  const [submitted, setSubmitted] = useState(null);

  const handleChange = (e) => {
    setFormData({ ...formData, [e.target.name]: e.target.value });
  };

  const handleSubmit = (e) => {
    e.preventDefault();
    setSubmitted(formData);
  };

  return (
    <div className="App">
      <h2>Login Form</h2>
      <form onSubmit={handleSubmit}>
        <div>
          <label>Username: </label>
          <input
            type="text"
            name="username"
            value={formData.username}
            onChange={handleChange}
            required
          />
        </div>
        <div>
          <label>Password: </label>
          <input
            type="password"
            name="password"
            value={formData.password}
            onChange={handleChange}
            required
          />
        </div>
        <button type="submit">Submit</button>
      </form>
      {submitted && (
        <div style={{ marginTop: '20px' }}>
          <h3>Submitted Data:</h3>
          <p>Username: {submitted.username}</p>
          <p>Password: {submitted.password}</p>
        </div>
      )}
    </div>
  );
}

export default LoginForm;