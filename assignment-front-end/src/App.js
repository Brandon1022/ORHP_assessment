import React, { useState } from 'react';
import AuthorDropdown from './AuthorDropdown';
import BookList from './BookList';

const App = () => {
    const [selectedAuthorId, setSelectedAuthorId] = useState(null);

    const handleAuthorSelect = (authorId) => {
        setSelectedAuthorId(authorId);
    };

    return (
        <div className='container'>
            <h1>Author and Book List</h1>
            <AuthorDropdown onAuthorSelect={handleAuthorSelect} />
            {selectedAuthorId && <BookList authorId={selectedAuthorId} />}
        </div>
    );
};

export default App;
