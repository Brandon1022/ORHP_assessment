package com.oldrepublic.backend.assignment;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.oldrepublic.backend.assignment.model.Author;
import com.oldrepublic.backend.assignment.model.Book;
import com.oldrepublic.backend.assignment.repository.AuthorRepository;
import com.oldrepublic.backend.assignment.repository.BookRepository;

@Component
public class DataSeeder implements CommandLineRunner {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void run(String... args) throws Exception {
        // Delete all existing records to start fresh
        bookRepository.deleteAll();
        authorRepository.deleteAll();

        // Create authors
        Author author1 = new Author();
        author1.setName("Robert Lafore");

        Author author2 = new Author();
        author2.setName("Bob Martin");

        authorRepository.saveAll(Arrays.asList(author1, author2));

        // Create books
        Book book1 = new Book();
        book1.setName("Programing Fundamentals");
        book1.setAuthor(author1);

        Book book2 = new Book();
        book2.setName("Solid Principle");
        book2.setAuthor(author1);

        Book book3 = new Book();
        book3.setName("Java World");
        book3.setAuthor(author2);

        bookRepository.saveAll(Arrays.asList(book1, book2, book3));
    }
}
