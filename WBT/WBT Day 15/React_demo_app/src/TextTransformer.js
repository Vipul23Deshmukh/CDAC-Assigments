import React, { Component } from 'react';

class TextTransformer extends Component {
  constructor(props) {
    super(props);
    this.state = {
      inputText: ''
    };
  }

  // Handle input change
  handleChange = (event) => {
    this.setState({ inputText: event.target.value });
  };

  // Handle uppercase button click
  handleUpperCase = () => {
    console.log(this.state.inputText.toUpperCase());
  };

  // Handle lowercase button click
  handleLowerCase = () => {
    console.log(this.state.inputText.toLowerCase());
  };

  render() {
    return (
      <div>
        <input
          type="text"
          placeholder="Enter text here"
          value={this.state.inputText}
          onChange={this.handleChange}
        />
        <br /><br />
        <button onClick={this.handleUpperCase}>UPPER CASE</button>
        <button onClick={this.handleLowerCase}>lower case</button>
      </div>
    );
  }
}

export default TextTransformer;
