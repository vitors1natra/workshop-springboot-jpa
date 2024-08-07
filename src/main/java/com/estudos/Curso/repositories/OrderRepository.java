package com.estudos.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	
}
