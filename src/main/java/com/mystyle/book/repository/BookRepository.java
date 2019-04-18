package com.mystyle.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.mystyle.book.domain.Book;

@RepositoryRestResource
public interface BookRepository extends JpaRepository<Book, Long> {

}
