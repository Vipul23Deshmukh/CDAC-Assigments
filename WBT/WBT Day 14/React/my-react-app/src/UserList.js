// src/UserList.js
import React from 'react';

function UserList() {
  const users = ['Vipul', 'Suyog', 'Priyanka', 'sumit'];

  return (
    <div>
      <h2>User List</h2>
      <ul>
        {users.map((name, index) => (
          <li key={index}>{name}</li>
        ))}
      </ul>
    </div>
  );
}

export default UserList;
