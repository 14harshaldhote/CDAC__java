import React, { useState } from 'react';
import UserList from './components/UserList';
import AddUser from './components/AddUser';

const App = () => {
  const [users, setUsers] = useState([]);

  const handleAddUser = (newUser) => {
    setUsers([...users, newUser]);
  };

  return (
    <div className="bg-zinc-400 min-h-screen text-black p-6">
      <h1 className="text-3xl mb-6">User Management App</h1>
      <AddUser onAddUser={handleAddUser} />
      <UserList />
      
    </div>
  );
}

export default App;
