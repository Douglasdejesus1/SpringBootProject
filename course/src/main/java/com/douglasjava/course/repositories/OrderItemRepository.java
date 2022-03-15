package com.douglasjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasjava.course.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
