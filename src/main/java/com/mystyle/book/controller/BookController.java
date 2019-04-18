package com.mystyle.book.controller;

import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mystyle.book.domain.Book;
import com.mystyle.book.repository.BookRepository;

@RestController
public class BookController {
	
	@Autowired
	 private BookRepository repository;

	    public BookController(BookRepository repository) {
	        this.repository = repository;
	    }

	    @GetMapping("/technical-books")
	    public Collection<Book> technicalBook() {
	        return repository.findAll().stream()
	                .filter(this::isTechnical)
	                .collect(Collectors.toList());
	    }

	    private boolean isTechnical(Book book) {
	        return !book.getBookName().equals("CoreJava") &&
	                !book.getBookName().equals("J2ee") &&
	                !book.getBookName().equals("HTML BOOK") &&
	                !book.getBookName().equals("CSS BOOK");
	    }

}
