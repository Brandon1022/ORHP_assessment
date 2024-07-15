package com.oldrepublic.backend.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oldrepublic.backend.assignment.model.Book;
import com.oldrepublic.backend.assignment.service.ApplicationService;

@RestController
@RequestMapping("/books")
@CrossOrigin
public class BookkController {

	@Autowired
	ApplicationService applicationService;

	@GetMapping("/{authorId}")
	public List<Book> generateStrings(@PathVariable  long authorId) {
		return applicationService.getBooks(authorId);
	}
}
