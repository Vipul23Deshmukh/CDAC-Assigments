
import React, { useState } from 'react';

function toTitleCase(str) {
  return str.replace(/\w\S*/g, function(txt){
    return txt.charAt(0).toUpperCase() + txt.substr(1).toLowerCase();
  });
}

const TextTransformer = () => {
  const [text, setText] = useState('');
  const [mode, setMode] = useState('uppercase');

  let transformedText = '';
  if (mode === 'uppercase') {
    transformedText = text.toUpperCase();
  } else if (mode === 'lowercase') {
    transformedText = text.toLowerCase();
  } else if (mode === 'titlecase') {
    transformedText = toTitleCase(text);
  }

  return (
    <div style={{ margin: '20px 0' }}>
      <h3>Text Transformer</h3>
      <input
        type="text"
        value={text}
        onChange={e => setText(e.target.value)}
        placeholder="Enter text here"
        style={{ width: '300px', padding: '5px' }}
      />
      <div style={{ margin: '10px 0' }}>
        <label>
          <input
            type="radio"
            name="mode"
            value="uppercase"
            checked={mode === 'uppercase'}
            onChange={() => setMode('uppercase')}
          /> Uppercase
        </label>
        <label style={{ marginLeft: '15px' }}>
          <input
            type="radio"
            name="mode"
            value="lowercase"
            checked={mode === 'lowercase'}
            onChange={() => setMode('lowercase')}
          /> Lowercase
        </label>
        <label style={{ marginLeft: '15px' }}>
          <input
            type="radio"
            name="mode"
            value="titlecase"
            checked={mode === 'titlecase'}
            onChange={() => setMode('titlecase')}
          /> Title Case
        </label>
      </div>
      <div>
        <strong>Output:</strong>
        <div style={{ marginTop: '5px', padding: '10px', border: '1px solid #ccc', minHeight: '30px' }}>
          {transformedText}
        </div>
      </div>
    </div>
  );
};

export default TextTransformer;
