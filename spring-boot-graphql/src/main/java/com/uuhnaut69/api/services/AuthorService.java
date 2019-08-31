package com.uuhnaut69.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uuhnaut69.api.entities.Author;
import com.uuhnaut69.api.repositories.AuthorRepository;

import lombok.AllArgsConstructor;

/**
 * @author uuhnaut
 *
 */
@Service
@AllArgsConstructor
public class AuthorService {
	private final AuthorRepository authorRepository;

	@Transactional(readOnly = true)
	public Optional<Author> getAuthor(int id) {
		return authorRepository.findById(id);
	}
	
	@Transactional(readOnly = true)
	public List<Author> getAuthors(){
		return authorRepository.findAll();
	}

	@Transactional
	public Author createAuthor(String firstName, String lastName) {
		Author author = new Author();
		author.setFirstName(firstName);
		author.setLastName(lastName);
		return authorRepository.save(author);
	}
}
