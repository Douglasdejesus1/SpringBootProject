package com.douglasjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasjava.course.entities.Order;


public interface OrderRepository extends JpaRepository<Order, Long>{
	

}
