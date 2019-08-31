package com.uuhnaut69.api.rootquery;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.uuhnaut69.api.entities.Book;
import com.uuhnaut69.api.services.BookService;

import lombok.AllArgsConstructor;

/**
 * @author uuhnaut
 *
 */
@Component
@AllArgsConstructor
public class BookQuery implements GraphQLQueryResolver {

	private final BookService bookService;

	public Optional<Book> getBook(int id) {
		return bookService.getBook(id);
	}

	public List<Book> getBooks() {
		return bookService.getBooks();
	}
}
