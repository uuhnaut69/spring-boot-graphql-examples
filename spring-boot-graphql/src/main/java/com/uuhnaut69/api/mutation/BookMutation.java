package com.uuhnaut69.api.mutation;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.uuhnaut69.api.entities.Author;
import com.uuhnaut69.api.entities.Book;
import com.uuhnaut69.api.services.BookService;

import lombok.AllArgsConstructor;

/**
 * @author uuhnaut
 *
 */
@Component
@AllArgsConstructor
public class BookMutation implements GraphQLMutationResolver {
	private final BookService bookService;

	public Book createBook(String name, int pageCount, Author author) {
		return bookService.createBook(name, pageCount, author);
	}
}
