package com.cgi.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cgi.main.entity.Book;
import com.cgi.main.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {

    
	@Autowired
	private BookRepository bookRepository;
	
	
	public Book addBook(Book book) {
		return bookRepository.save(book); 
	}

	public List<Book> getAllBooks() {
		return bookRepository.findAll();
	}

	public Book updateBook(Book book) {
		if(bookRepository.existsById(book.getId()))
			return bookRepository.save(book);
		else
			return null;

	}

	public Book deleteBook(String bookid) {
		if(bookRepository.existsById(bookid)) {
			Book deletedbook = bookRepository.findById(bookid).get();
			bookRepository.deleteById(bookid);
			return deletedbook;
		}else {
			return null;
		}

	}

	
	

	public Book findByBookid(String bookid) {
		return bookRepository.findById(bookid).get();
	
	}

	public List<Book> findByBooktitle(String title) {
		return bookRepository.findByTitle(title);
	
	}

	

	

	

	

}