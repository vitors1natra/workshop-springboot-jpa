package com.estudos.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudos.Curso.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
}
