package com.academia.biblioteca.academiabiblioteca;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookControler {
	
	@Autowired
	private AcademiaDaoService service;
	
	@GetMapping("/books")
	public List<Book> retrieveAllBooks(){
		return service.findAll();
	}
	
	@GetMapping("/book/{id}")
	public Book retrieveLivro(@PathVariable int id) {
		return service.findOne(id);
	}
	
	@PostMapping("/books")
	public void createBook(@RequestBody Book book){
		service.save(book);
	}
	
	@DeleteMapping("/book/(id)")
	public Book deleteLivro(@PathVariable int id) {
		
		return service.deleteById(id);
	}
	
}
