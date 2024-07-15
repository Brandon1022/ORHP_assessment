import React, { useState, useEffect } from 'react';

const BookList = ({ authorId }) => {
    const [books, setBooks] = useState([]);

    useEffect(() => {
        if (authorId) {
            fetch(`http://localhost:8080/assignment-service/books/${authorId}`)  // Adjust the URL as needed
                .then(response => response.json())
                .then(data => setBooks(data))
                .catch(error => console.error('Error fetching books:', error));
        }
    }, [authorId]);

    return (
        <div className="mt-4">
            <h2>Books</h2>
            {books.length > 0 ? (
                <ul className="list-group">
                    {books.map(book => (
                        <li key={book.id} className="list-group-item">{book.name}</li>
                    ))}
                </ul>
            ) : (
                <p className="text-muted">No books found for this author.</p>
            )}
        </div>
    );
};

export default BookList;
