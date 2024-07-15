import React, { useState, useEffect } from 'react';

const AuthorDropdown = ({ onAuthorSelect }) => {
    const [authors, setAuthors] = useState([]);
    const [selectedAuthor, setSelectedAuthor] = useState('');

    useEffect(() => {
        fetch('http://localhost:8080/assignment-service/authors/')  // Adjust the URL as needed
            .then(response => response.json())
            .then(data => setAuthors(data))
            .catch(error => console.error('Error fetching authors:', error));
    }, []);

    const handleChange = (event) => {
        const authorId = event.target.value;
        setSelectedAuthor(authorId);
        onAuthorSelect(authorId);
    };

    return (
        <div className="form-group">
            <label htmlFor="authorSelect">Select an Author:</label>
            <select
                id="authorSelect"
                className="form-control"
                value={selectedAuthor}
                onChange={handleChange}
            >
                <option value="">Select an author</option>
                {authors.map(author => (
                    <option key={author.id} value={author.id}>
                        {author.name}
                    </option>
                ))}
            </select>
        </div>
    );
};

export default AuthorDropdown;
