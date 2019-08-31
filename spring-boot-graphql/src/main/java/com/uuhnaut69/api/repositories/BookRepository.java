package com.uuhnaut69.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uuhnaut69.api.entities.Book;

/**
 * @author uuhnaut
 *
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
