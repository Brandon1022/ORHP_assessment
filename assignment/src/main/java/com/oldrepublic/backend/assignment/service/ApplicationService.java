package com.oldrepublic.backend.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oldrepublic.backend.assignment.model.Author;
import com.oldrepublic.backend.assignment.model.Book;
import com.oldrepublic.backend.assignment.repository.AuthorRepository;
import com.oldrepublic.backend.assignment.repository.BookRepository;

@Service
public class ApplicationService {
	
	@Autowired
	AuthorRepository authorsRepository;
	
	@Autowired
	BookRepository booksRepository;

	public List<Author> getAuthors() {
		return authorsRepository.findAll();
	}

	public List<Book> getBooks(long authorId) {
		return booksRepository.findByAuthorId(authorId);
	}
}
