package com.proctur.app.author;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
	@Autowired
	private AuthorRepositoy authorRepository;

	public List<Author> getAllAuthors() {
		List<Author> authors = new ArrayList<>();
		authorRepository.findAll().
		forEach(authors::add);
		return authors;
	}

	public Author getAuthor(int id) {
		
		return authorRepository.findById(id).get();
	}

	public String updateAuthor(int id, Author author) {
		authorRepository.save(author);
		return "Updated Sucessfully";
	}

	public String addAuthor(Author author) {
		authorRepository.save(author);
		return "Added Sucessfully";		
	}

	public String deleteAuthor(int id) {
		authorRepository.deleteById(id);
		return "Deleted Sucessfully";
	}

}
