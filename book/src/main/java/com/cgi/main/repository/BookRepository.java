package com.cgi.main.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.cgi.main.entity.Book;



	
	
	@Repository
	public interface BookRepository extends MongoRepository<Book, String> {


		List<Book> findByTitle(String title);
//		List<Book> findByAuthor(String author);
//		List<Book> findByCategory(String category);
//		List<Book> findByPublisher(String publisher);
		
	}