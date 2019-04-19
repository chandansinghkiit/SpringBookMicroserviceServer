package com.mystyle.book.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.mystyle.book.domain.Book;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface BookRepository extends JpaRepository<Book, Long> {

}
