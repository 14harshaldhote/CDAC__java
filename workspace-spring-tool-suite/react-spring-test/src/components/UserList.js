import React, { useState, useEffect } from 'react';
import axios from 'axios';

const UserList = () => {
  const [users, setUsers] = useState([]);
  const [editingUser, setEditingUser] = useState(null);

  useEffect(() => {
    axios.get('http://localhost:8888/api/users')
      .then(response => setUsers(response.data))
      .catch(error => console.error('Error fetching users:', error));
  }, []);

  const handleEditClick = (user) => {
    setEditingUser(user);
  };

  const handleCancelEdit = () => {
    setEditingUser(null);
  };

  const handleSaveEdit = () => {
    axios.put(`http://localhost:8888/api/users/${editingUser.id}`, editingUser)
      .then(() => {
        setEditingUser(null);
        axios.get('http://localhost:8888/api/users')
          .then(response => setUsers(response.data))
          .catch(error => console.error('Error fetching users:', error));
      })
      .catch(error => console.error('Error updating user:', error));
  };

  const handleDeleteUser = (id) => {
    axios.delete(`http://localhost:8888/api/users/${id}`)
      .then(() => {
       
        axios.get('http://localhost:8888/api/users')
          .then(response => setUsers(response.data))
          .catch(error => console.error('Error fetching users:', error));
      })
      .catch(error => console.error('Error deleting user:', error));
  };

  const handleInputChange = (e, field) => {
    setEditingUser({
      ...editingUser,
      [field]: e.target.value,
    });
  };

    return (
        
        <div className="bg-slate-500 text-black p-6 rounded-md shadow-md bg-blur">
          <h2 className="text-2xl mb-4">User List</h2>
          <ul>
            {users.map(user => (
              <li key={user.id} className="mb-4 p-4 border border-gray-700 rounded-md bg-opacity-90">
                {editingUser && editingUser.id === user.id ? (
                  <div className="flex items-center space-x-4">
                    <input
                      type="text"
                      value={editingUser.firstName}
                      onChange={(e) => handleInputChange(e, 'firstName')}
                      className="bg-dark-800 text-black px-4 py-2 rounded-md focus:outline-none focus:ring focus:border-purple-300 w-1/3"
                    />
                    <input
                      type="text"
                      value={editingUser.lastName}
                      onChange={(e) => handleInputChange(e, 'lastName')}
                      className="bg-dark-800 text-black px-4 py-2 rounded-md focus:outline-none focus:ring focus:border-purple-300 w-1/3"
                    />
                    <input
                      type="text"
                      value={editingUser.email}
                      onChange={(e) => handleInputChange(e, 'email')}
                      className="bg-dark-800 text-black px-4 py-2 rounded-md focus:outline-none focus:ring focus:border-purple-300 w-1/3"
                    />
                    <button onClick={handleSaveEdit} className="bg-purple-500 hover:bg-fuchsia-700 text-white px-4 py-2 rounded-md">Save</button>
                    <button onClick={handleCancelEdit} className="bg-gray-500 hover:bg-gray-700 text-white px-4 py-2 rounded-md">Cancel</button>
                  </div>
                ) : (
                  <div className="flex items-center justify-between">
                    <div>
                      <span className="text-black font-bold">
                        {user.firstName} {user.lastName} -
                      </span>{" "}
                      <span className="text-black">{user.email}</span>
                    </div>
                    <div>
                      <button onClick={() => handleEditClick(user)} className="bg-blue-500 hover:bg-blue-700 text-white px-4 py-2 rounded-md">Edit</button>
                      <button onClick={() => handleDeleteUser(user.id)} className="bg-red-500 hover:bg-red-700 text-white px-4 py-2 rounded-md ml-2">Delete</button>
                    </div>
                  </div>
                )}
              </li>
            ))}
          </ul>
        </div>
      );
    }
    
    export default UserList;