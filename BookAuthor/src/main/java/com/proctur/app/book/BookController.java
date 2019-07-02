package com.proctur.app.book;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/book")
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("")
	public List<Book> getAllBooks(){		
		return bookService.getAllBooks();
	}
	
	@RequestMapping(value = "/{Id}")
	public Book getBook(@PathVariable int Id) {
		
		return bookService.getBook(Id);
	}
	
	@RequestMapping(value = "/{Id}", method = RequestMethod.PUT)
	public String updateBook(@PathVariable int Id,  @RequestBody Book book) {
		bookService.updateBook(Id, book);
		return "Updated Sucessfully";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public String addBook(@RequestBody Book book) {
		bookService.addBook(book);
		return "Added Sucessfully";
	}
	
	@RequestMapping(value = "/{Id}", method = RequestMethod.DELETE)
	public String deleteBook(@PathVariable int Id) {
		bookService.deleteBook(Id);
		return "Deleted Sucessfully";
	}
	
//	@RequestMapping(value = "/author/add", method = RequestMethod.POST)
//	public String addAuthor() {
//		
//		return "Added Sucessfully";
//	}

}
