package com.uuhnaut69.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.uuhnaut69.api.entities.Author;
import com.uuhnaut69.api.entities.Book;
import com.uuhnaut69.api.repositories.AuthorRepository;
import com.uuhnaut69.api.repositories.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {

	private final BookRepository bookRepository;
	private final AuthorRepository authorRepository;

	@Transactional(readOnly = true)
	public Optional<Book> getBook(int id) {
		return bookRepository.findById(id);
	}

	@Transactional(readOnly = true)
	public List<Book> getBooks() {
		return bookRepository.findAll();
	}

	@Transactional
	public Book createBook(String name, int pageCount, Author author) {
		Book book = new Book();
		book.setName(name);
		book.setPageCount(pageCount);
		book.setAuthor(author);
		authorRepository.save(author);
		return bookRepository.save(book);
	}
}
