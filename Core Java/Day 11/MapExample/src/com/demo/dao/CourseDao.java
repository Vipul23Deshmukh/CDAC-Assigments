package com.demo.dao;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public interface CourseDao {

	Map<String, Integer> ByNameKeySort = null;



	boolean save(String cname, int capacity);

	Map<String, Integer> showAll();

	int SearchByName(String cname);

	boolean ModifyByName(String cname, int newCapacity);

	Set<String> showByCapacity(int c);

	

	boolean ModifyCoursename(String oname, String nname);

	Map<String, Integer> ByNameKeySort();

	Set<Entry<String, Integer>> ByCapacityKeysort();

	boolean RemoveByName(String cname);

	boolean RemoveByCapacity(int cap);

}
