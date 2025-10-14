package com.demo.service;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseService {

	boolean AddCourse();

	Map<String, Integer> findAll();

	int FindByCname(String cname);

	boolean ModifyByName(String cname, int newCapacity);

	Set<String> displayByCapacity(int c);

	boolean UpdateCname(String oname, String nname);

	Map<String, Integer> sortByNameKey();

	Set<Entry<String, Integer>> sortByCapacity();

	boolean deleteByName(String cname);

	boolean DeleteByCapacity(int cap);
	

	

}
