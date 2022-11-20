package com.WebApp.ACSA;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.WebApp.ACSA.DOMINIO.categoria;
import com.WebApp.ACSA.DOMINIO.livros;
import com.WebApp.ACSA.Repository.CategoriaRepository;
import com.WebApp.ACSA.Repository.LivrosRepository;

@SpringBootApplication
public class AcsaSpringApplication implements CommandLineRunner{
	
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	@Autowired
	private LivrosRepository livrosRepository;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(AcsaSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		categoria cat1 =  new categoria(null, "Informatica", "Livro de Java");
		
		livros liv  = new livros(null, "Spring", "stive", "java 2", cat1);
		
		
		cat1.getLivro().addAll(Arrays.asList(liv));	
		
		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livrosRepository.saveAll(Arrays.asList(liv));
	}

}
