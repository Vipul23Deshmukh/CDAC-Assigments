import React, { useState } from 'react';

function GraduateComponent() {
  const [details, setDetails] = useState({
    degree: '',
    year: '',
    score: '',
    university: ''
  });

  const handleChange = (e) => {
    const { name, value } = e.target;
    setDetails(prev => ({ ...prev, [name]: value }));
  };

  return (
    <div>
      <h3>Graduate Details</h3>
      <input name="degree" placeholder="Degree" onChange={handleChange} /><br />
      <input name="year" placeholder="Year" onChange={handleChange} /><br />
      <input name="score" placeholder="Final Year Score" onChange={handleChange} /><br />
      <input name="university" placeholder="University" onChange={handleChange} /><br />
    </div>
  );
}

export default GraduateComponent;