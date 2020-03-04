package com.mx.bookstore.BookStoreClient;

import java.util.List;

import com.mx.bookstore.service.Book;
import com.mx.bookstore.service.BookService;
import com.mx.bookstore.service.BookServiceImplService;

public class BookStoreClient {

	BookService bookService = new BookServiceImplService().getBookServiceImplPort();
	
	public Book createBook(Book book) {
		System.out.println("Book created success");
		return bookService.createBook(book);
	}
	
	public List<Book> getAll(){
		return bookService.getAll();
	}
}
