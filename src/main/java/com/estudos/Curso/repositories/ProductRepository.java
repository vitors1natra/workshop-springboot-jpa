package com.estudos.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
}
