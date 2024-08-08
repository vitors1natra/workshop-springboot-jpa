package com.estudos.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
}
