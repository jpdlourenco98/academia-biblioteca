package com.academia.biblioteca.academiabiblioteca;

public class Book {
	Integer id;
	String nome;
	String autor;
	
	public Book(Integer id, String nome, String autor) {
		super();
		this.id = id;
		this.nome = nome;
		this.autor = autor;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", nome=" + nome + ", autor=" + autor + "]";
	}
	
	
}
