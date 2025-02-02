package com.oldrepublic.backend.assignment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oldrepublic.backend.assignment.model.Book;

@Repository
public interface BookRepository  extends JpaRepository<Book, Integer> {
	public List<Book> findByAuthorId(Long authorId);
}
