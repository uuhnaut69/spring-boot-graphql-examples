package com.uuhnaut69.api.rootquery;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.uuhnaut69.api.entities.Author;
import com.uuhnaut69.api.services.AuthorService;

import lombok.AllArgsConstructor;

/**
 * @author uuhnaut
 *
 */
@Component
@AllArgsConstructor
public class AuthorQuery implements GraphQLQueryResolver {
	private final AuthorService authorService;

	public Optional<Author> getAuthor(int id) {
		return authorService.getAuthor(id);
	}

	public List<Author> getAuthors() {
		return authorService.getAuthors();
	}
}
