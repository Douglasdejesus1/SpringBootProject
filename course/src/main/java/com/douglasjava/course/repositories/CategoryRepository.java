package com.douglasjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasjava.course.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long>{
}
