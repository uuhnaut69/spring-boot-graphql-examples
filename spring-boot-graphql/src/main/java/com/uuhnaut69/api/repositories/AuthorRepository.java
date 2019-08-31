package com.uuhnaut69.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.uuhnaut69.api.entities.Author;

/**
 * @author uuhnaut
 *
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
