import React, { Component } from 'react';

class LifecycleDemo extends Component {
  constructor(props) {
    super(props);
    this.state = {
      message: 'Hello'
    };
    console.log('Constructor: State initialized');
  }

  componentDidMount() {
    console.log('componentDidMount: Component mounted');
  }

  componentDidUpdate(prevProps, prevState) {
    console.log('componentDidUpdate: State or props changed');
  }

  componentWillUnmount() {
    console.log('componentWillUnmount: Component will be removed');
  }

  changeMessage = () => {
    this.setState({ message: 'Goodbye' });
  };

  render() {
    return (
      <div>
        <h3>{this.state.message}</h3>
        <button onClick={this.changeMessage}>Change Message</button>
      </div>
    );
  }
}

export default LifecycleDemo;
