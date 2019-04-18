package com.mystyle;

import java.util.stream.Stream;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.mystyle.book.domain.Book;
import com.mystyle.book.repository.BookRepository;

@SpringBootApplication
public class SpringMicroServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroServiceServerApplication.class, args);
	}
	
	 @Bean
	    ApplicationRunner init(BookRepository repository) {
	        return args -> {
	            Stream.of("CGBOOK", "Angular", "Springbook", "SpringBoot", "Corejava",
	                      "Java j2ee", "Html Book", "CSS book", "JavaScript Book").forEach(bookName -> {
	                Book book = new Book();
	                book.setBookName(bookName);
	                
	                repository.save(book);
	            });
	            repository.findAll().forEach(System.out::println);
	        };
	    }

}
