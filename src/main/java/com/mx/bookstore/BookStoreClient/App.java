package com.mx.bookstore.BookStoreClient;

import java.util.List;

import com.mx.bookstore.service.Book;
import com.mx.bookstore.service.BookTypeEnum;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void main(String[] args) {
		BookStoreClient bookstoreClient = new BookStoreClient();
		
		if (args[0].equals("create")) {
			Book book = new Book();
			
			book.setName(args[1]);
			book.setAuthor(args[2]);
			book.setIsbn(args[3]);
			book.setEditorial(args[4]);
			book.setType(args[5].equals(BookTypeEnum.DIGITAL.toString()) ? BookTypeEnum.DIGITAL: BookTypeEnum.PHYSICAL);
			bookstoreClient.createBook(book);
		} else {
			List<Book> books = bookstoreClient.getAll();
			for (Book book : books) {
				System.out.println(book.getName());
			}
		}
	}
}
