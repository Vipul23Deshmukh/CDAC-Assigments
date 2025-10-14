package com.demo.dao;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;

public class CoursedaoImpl implements CourseDao {
	static Map<String,Integer> mm;
	static {
		mm=new HashMap<>();
		mm.put("DAC", 240);
		mm.put("DBDA",65);
		mm.put("DTISS",60);
		
	}

	@Override
	public boolean save(String cname, int capacity) {
		if(mm.containsKey(cname))
		return false;
		
		mm.put(cname, capacity);
		return true;
	}

	@Override
	public Map<String, Integer> showAll() {
		
		return mm;
	}

	@Override
	public int SearchByName(String cname) {
		if(mm.containsKey(cname))
		return mm.get(cname);
		else return -1;
	}

	@Override
	public boolean ModifyByName(String cname, int newCapacity) {
		if(mm.containsKey(cname))
			
		{
			mm.put(cname, newCapacity);
			return true;
		}
		return false;
	}

	@Override
	public Set<String> showByCapacity(int c) {
		Set<String> keys=mm.keySet();
		Set<String> cnames=new HashSet<>();
		
		for(String s:keys)
		{
			if(mm.get(s)>c)
			{
				cnames.add(s);
			}
			if(cnames.size()>0)
			{
				return cnames;
			}
			
		}
		return null;
	}

	@Override
	public boolean ModifyCoursename(String oname, String nname) {
		// TODO Auto-generated method stub
		return false;
	}

	

}
