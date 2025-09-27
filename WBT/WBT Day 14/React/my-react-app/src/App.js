
import React from 'react';
import UserList from './UserList';
import MyFunction from './myFunction';
import Hello from './hello';


function App() {
  return (
    <div className="App">
      <marquee><h1>Welcome to My React App</h1></marquee>
     
      <UserList />

      <MyFunction />

      <Hello />

    </div>
  );
}

export default App;
