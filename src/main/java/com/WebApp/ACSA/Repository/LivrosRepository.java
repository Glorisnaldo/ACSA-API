package com.WebApp.ACSA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WebApp.ACSA.DOMINIO.livros;

@Repository
public interface LivrosRepository extends JpaRepository<livros, Integer> {

}
