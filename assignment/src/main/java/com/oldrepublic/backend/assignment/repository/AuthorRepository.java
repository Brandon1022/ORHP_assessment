package com.oldrepublic.backend.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.oldrepublic.backend.assignment.model.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}