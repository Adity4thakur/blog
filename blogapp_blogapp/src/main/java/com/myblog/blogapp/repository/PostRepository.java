package com.myblog.blogapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.myblog.blogapp.entity.POST;

public interface PostRepository extends JpaRepository<POST , Long>{

	
	// why jpa repository because its give pagination support
	// and this genetics <>
}
