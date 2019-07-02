package com.proctur.app.author;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/author")
public class AuthorController {
	@Autowired
	private AuthorService authorService; 
	@RequestMapping("")
	public List<Author> getAllAuthor(){		
		return authorService.getAllAuthors();
	}
	
	@RequestMapping(value = "/{Id}")
	public Author getBook(@PathVariable int Id) {
		
		return authorService.getAuthor(Id);
	}
	
	@RequestMapping(value = "/{Id}", method = RequestMethod.PUT)
	public String updateBook(@PathVariable int Id,  @RequestBody Author book) {
		authorService.updateAuthor(Id, book);
		return "Updated Sucessfully";
	}
	
	@RequestMapping(value = "", method = RequestMethod.POST, consumes = "application/json")
	@ResponseBody
	public String addBook(@RequestBody Author book) {
		authorService.addAuthor(book);
		return "Added Sucessfully";
	}
	
	@RequestMapping(value = "/{Id}", method = RequestMethod.DELETE)
	public String deleteBook(@PathVariable int Id) {
		authorService.deleteAuthor(Id);
		return "Deleted Sucessfully";
	}

}
