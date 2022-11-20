package com.WebApp.ACSA.DOMINIO;

import java.util.Objects;

public class livros {
	
	private Integer id;
	private String titulos;
	private String nome_autor;
	private String texto;
	
	private categoria categoria;
	
	public livros() {
		super();
		// TODO Auto-generated constructor stub
	}

	public livros(Integer id, String titulos, String nome_autor, String texto,
			com.WebApp.ACSA.DOMINIO.categoria categoria) {
		super();
		this.id = id;
		this.titulos = titulos;
		this.nome_autor = nome_autor;
		this.texto = texto;
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulos() {
		return titulos;
	}

	public void setTitulos(String titulos) {
		this.titulos = titulos;
	}

	public String getNome_autor() {
		return nome_autor;
	}

	public void setNome_autor(String nome_autor) {
		this.nome_autor = nome_autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		livros other = (livros) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
