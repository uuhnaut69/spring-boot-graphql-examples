package com.uuhnaut69.api.mutation;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.uuhnaut69.api.entities.Author;
import com.uuhnaut69.api.services.AuthorService;

import lombok.AllArgsConstructor;

/**
 * @author uuhnaut
 *
 */
@Component
@AllArgsConstructor
public class AuthorMutation implements GraphQLMutationResolver {

	private final AuthorService authorService;

	public Author createAuthor(String firstName, String lastName) {
		return authorService.createAuthor(firstName, lastName);
	}
}
