package com.douglasjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasjava.course.entities.Product;


public interface ProductRepository extends JpaRepository<Product, Long>{
}
