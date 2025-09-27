
import React, { useState } from 'react';

function GraduateComponent({ degree, setDegree, year, setYear, score, setScore, university, setUniversity }) {
	return (
		<div>
			<h4>Graduate Details</h4>
			<input type="text" placeholder="Degree" value={degree} onChange={e => setDegree(e.target.value)} /> <br />
			<input type="text" placeholder="Year" value={year} onChange={e => setYear(e.target.value)} /> <br />
			<input type="text" placeholder="Final Year Score" value={score} onChange={e => setScore(e.target.value)} /> <br />
			<input type="text" placeholder="University" value={university} onChange={e => setUniversity(e.target.value)} /> <br />
		</div>
	 );
}

function PGComponent({ year, setYear, thesis, setThesis }) {
	return (
		<div>
			<h4>PG Details</h4>
			
            <input type="text" placeholder="Year" value={year} onChange={e => setYear(e.target.value)} /> <br />
			<input type="text" placeholder="Thesis Subject" value={thesis} onChange={e => setThesis(e.target.value)} /> <br />
		</div>

	                   
);
}  
  


function UnderGradComponent({ ssc, setSSC, hsc, setHSC }) {
	return (
		<div>


			<h4>UnderGrad Details</h4>
			
            <input type="text" placeholder="SSC" value={ssc} onChange={e => setSSC(e.target.value)} /> <br />
			
                         <input type="text" placeholder="HSC" value={hsc} onChange={e => setHSC(e.target.value)} /> <br />
		</div>
	);
}

function UserDetails() {
	const [name, setName] = useState('');
	   const [email, setEmail] = useState('');
	     const [educationType, setEducationType] = useState('');

	// Graduate state
	const [degree, setDegree] = useState('');
	   const [gradYear, setGradYear] = useState('');
	    const [score, setScore] = useState('');
	              const [university, setUniversity] = useState('');

	// PG state
	const [pgYear, setPGYear] = useState('');
	  const [thesis, setThesis] = useState('');

	// UnderGrad state
	const [ssc, setSSC] = useState('');
	   const [hsc, setHSC] = useState('');

	return (
		<div style={{ padding: '50px', maxWidth: '400px' }}>
			<h3>User Details</h3>
			<input type="text" placeholder="Name" value={name} onChange={e => setName(e.target.value)} /> <br />
			 <input type="email" placeholder="Email" value={email} onChange={e => setEmail(e.target.value)} /> <br />
			<select value={educationType} onChange={e => setEducationType(e.target.value)} style={{ marginTop: '10px' }}>
				<option value="">Select Education</option>
				<option value="Graduate">Graduate</option>
				 <option value="PG">PG</option>
				<option value="UnderGrad">UnderGrad</option>
			</select>

			{/* Conditional Rendering */}
			{educationType === 'Graduate' && (
				<GraduateComponent
					degree={degree} setDegree={setDegree}
					year={gradYear} setYear={setGradYear}
					score={score} setScore={setScore}
					university={university} setUniversity={setUniversity}
				/>
			)}
			{educationType === 'PG' && (
				<PGComponent
					year={pgYear} setYear={setPGYear}
					thesis={thesis} setThesis={setThesis}
				/>
			)}
			{educationType === 'UnderGrad' && (
				<UnderGradComponent
					ssc={ssc} setSSC={setSSC}
					hsc={hsc} setHSC={setHSC}
				/>
			)}
		</div>
	);
}

export default UserDetails;

