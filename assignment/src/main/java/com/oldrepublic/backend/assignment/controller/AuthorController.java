package com.oldrepublic.backend.assignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oldrepublic.backend.assignment.model.Author;
import com.oldrepublic.backend.assignment.service.ApplicationService;

@RestController
@RequestMapping("/authors")
@CrossOrigin
public class AuthorController {

	@Autowired
	ApplicationService applicationService;

	@GetMapping("/")
	public List<Author> generateStrings() {
		return applicationService.getAuthors();
	}
}
