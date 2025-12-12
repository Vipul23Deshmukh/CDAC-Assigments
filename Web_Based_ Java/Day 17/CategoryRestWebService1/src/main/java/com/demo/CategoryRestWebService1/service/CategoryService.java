package com.demo.CategoryRestWebService1.service;

import com.demo.CategoryRestWebService1.beans.Category;
import com.demo.CategoryRestWebService1.dto.CategoryDto;

public interface CategoryService {

	Category getById(int cid);

	CategoryDto getProdCatById(int cid);

}
