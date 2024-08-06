package com.estudos.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
