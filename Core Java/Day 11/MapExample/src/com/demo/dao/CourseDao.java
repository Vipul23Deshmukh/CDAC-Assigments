package com.demo.dao;

import java.util.Map;
import java.util.Set;

public interface CourseDao {

	boolean save(String cname, int capacity);

	Map<String, Integer> showAll();

	int SearchByName(String cname);

	boolean ModifyByName(String cname, int newCapacity);

	Set<String> showByCapacity(int c);

	

	boolean ModifyCoursename(String oname, String nname);

}
