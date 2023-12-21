import React, { useState } from 'react';
import axios from 'axios';

const AddUser = ({ onAddUser }) => {
  const [newUser, setNewUser] = useState({
    firstName: '',
    lastName: '',
    email: ''
  });

  const handleInputChange = (e) => {
    setNewUser({ ...newUser, [e.target.name]: e.target.value });
  };

  const handleAddUser = () => {
    axios.post('http://localhost:8888/api/users', newUser)
      .then(response => onAddUser(response.data))
      .catch(error => console.error('Error adding user:', error));
  };

  return (
    <div className="flex justify-center p-2 m-2 ">

   
    <div className=" text-black p-6 rounded-md shadow-md mt-4 w-1/2 bg-violet-950/50 ">
      <h2 className="text-2xl mb-4">Add User</h2>
      <div className="mb-4 ">
        <input type="text" name="firstName" placeholder="First Name" onChange={handleInputChange} className="bg-purple-200/15 text-black px-4 py-2 rounded-md w-full " />
      </div>
      <div className="mb-4">
        <input type="text" name="lastName" placeholder="Last Name" onChange={handleInputChange} className="bg-purple-200/15 text-black px-4 py-2 rounded-md w-full" />
      </div>
      <div className="mb-4">
        <input type="text" name="email" placeholder="Email" onChange={handleInputChange} className="bg-purple-200/15 text-black px-4 py-2 rounded-md w-full" />
      </div>
      <button onClick={handleAddUser} className="bg-purple-500 hover:bg-fuchsia-700  text-white px-4 py-2 rounded-md">Add User</button>
    </div>
    </div>
  );
}

export default AddUser;
