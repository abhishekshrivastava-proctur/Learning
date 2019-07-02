package com.proctur.app.book;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	@Autowired
	private BookRepository bookRepository;

	public List<Book> getAllBooks() {
		List<Book> books = new ArrayList<>();
		bookRepository.findAll().forEach(books::add);
		return books;
	}

	public Book getBook(int Id) {
		return bookRepository.findById(Id).orElse(null);
	}

	public void updateBook(int Id, Book book) {

		bookRepository.save(book);
	}

	public void addBook(Book book) {

		bookRepository.save(book);
	}

	public void deleteBook(int id) {

		bookRepository.deleteById(id);
	}

}
