package com.WebApp.ACSA.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.WebApp.ACSA.DOMINIO.categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<categoria, Integer> {

}
