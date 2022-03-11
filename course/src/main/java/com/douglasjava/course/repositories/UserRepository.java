package com.douglasjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.douglasjava.course.entities.User;


public interface UserRepository extends JpaRepository<User, Long>{
	

}
