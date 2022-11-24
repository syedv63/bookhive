package com.cgi.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cgi.main.entity.Book;
import com.cgi.main.service.BookService;

@RestController
@RequestMapping("/api/v1/book")
@CrossOrigin
public class BookController {
    
	@Autowired
	private BookService bookService;

	@PostMapping
	public ResponseEntity<?> addBook(@RequestBody Book book) {
		Book newbook = bookService.addBook(book);
		if ( newbook != null)
			return new ResponseEntity<Book>(newbook,HttpStatus.CREATED);
		
		return new ResponseEntity<String>("Book not added",HttpStatus.CONFLICT);
	}

	@GetMapping
	public ResponseEntity<?> getAllBooks() {
		
		List<Book> booklist = bookService.getAllBooks();
		if ( booklist.size() > 0)
			return new ResponseEntity<List<Book>>(booklist,HttpStatus.OK);
		
		return new ResponseEntity<String>("Book list is empty",HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> updateBook(@RequestBody Book book) {
		Book updatedbook = bookService.updateBook(book);
		if ( updatedbook != null)
			return new ResponseEntity<Book>(updatedbook,HttpStatus.OK);
		
		return new ResponseEntity<String>("Book not updated",HttpStatus.OK);
	}

	@DeleteMapping("/{bookid}")
	public ResponseEntity<?> deleteBook(@PathVariable String bookid) {
		
		Book deletedbook = bookService.deleteBook(bookid);
		if ( deletedbook != null)
			return new ResponseEntity<Book>(deletedbook,HttpStatus.OK);
		
		return new ResponseEntity<String>("Book not Deleted",HttpStatus.OK);
	}
	
	@GetMapping("/{bookid}")
	public ResponseEntity<?> findByBookid(@PathVariable("bookid") String bookid) {
		
		Book getbyid=bookService.findByBookid(bookid);
		if ( getbyid != null)
			return new ResponseEntity<Book>(getbyid,HttpStatus.OK);
		
		return new ResponseEntity<String>("No Book found for this Id",HttpStatus.OK);
		
		}
	
	
	
//	@GetMapping("/author/{author}")
//	public ResponseEntity<?> findByBookauthor(@PathVariable("author") String author) {
//		
//		List<Book> booklist = bookService.findByBookauthor(author);
//		if ( booklist.size() > 0)
//			return new ResponseEntity<List<Book>>(booklist,HttpStatus.OK);
//		
//		return new ResponseEntity<String>("Book list is empty",HttpStatus.OK);
//	}
	
//	@GetMapping("/category/{category}")
//	public ResponseEntity<?> findByBookcategory(@PathVariable("category") String category) {
//		
//		List<Book> booklist = bookService.findByBookcategory(category);
//		if ( booklist.size() > 0)
//			return new ResponseEntity<List<Book>>(booklist,HttpStatus.OK);
//		
//		return new ResponseEntity<String>("Book list is empty",HttpStatus.OK);
//	}
	
	@GetMapping("/title/{title}")
	public ResponseEntity<?> findByBooktitle(@PathVariable("title") String title) {
		
		List<Book> booklist = bookService.findByBooktitle(title);
		if ( booklist.size() > 0)
			return new ResponseEntity<List<Book>>(booklist,HttpStatus.OK);
		
		return new ResponseEntity<String>("Book list is empty",HttpStatus.OK);
	}
}
	
//	@GetMapping("/publisher/{publisher}")
//	public ResponseEntity<?> findByBookpublisher(@PathVariable("publisher") String publisher) {
//		
//		List<Book> booklist = bookService.findByBookpublisher(publisher);
//		if ( booklist.size() > 0)
//			return new ResponseEntity<List<Book>>(booklist,HttpStatus.OK);
//		
//		return new ResponseEntity<String>("Book list is empty",HttpStatus.OK);
//	}
