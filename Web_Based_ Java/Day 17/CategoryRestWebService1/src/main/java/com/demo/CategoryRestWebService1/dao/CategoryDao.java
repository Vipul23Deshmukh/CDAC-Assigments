package com.demo.CategoryRestWebService1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.CategoryRestWebService1.beans.Category;

public interface CategoryDao extends JpaRepository<Category, Integer> {

}
