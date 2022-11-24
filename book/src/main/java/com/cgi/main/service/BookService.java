package com.cgi.main.service;

import java.util.List;

import com.cgi.main.entity.Book;

public interface BookService {

	public Book findByBookid(String bookid);
	public Book addBook(Book book);
	public List<Book> getAllBooks();
	public Book updateBook(Book book);
	public Book deleteBook(String bookid);
	public List<Book> findByBooktitle(String title);
	
//	public List<Book> findByBookcategory(String category);
//	public List<Book> findByBookpublisher(String publisher);
	
}
