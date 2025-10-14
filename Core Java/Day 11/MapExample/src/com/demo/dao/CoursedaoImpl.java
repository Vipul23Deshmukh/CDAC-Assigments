package com.demo.dao;
import java.util.*;
import java.util.Map;
import java.util.Map.Entry;
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
		mm.put("ABC", 600);
		
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
        Set<String> keys=mm.keySet();
        if(mm.containsKey(oname))
        {
        	int c=mm.remove(oname);
        	
        	mm.put(nname, c);
        	return true;
        }
		
		return false;
	}

	@Override
	public Map<String, Integer> ByNameKeySort() {
		Map<String,Integer> tmap=new TreeMap<>();
		Set<String> keys=mm.keySet();
		for(String s:keys)
		{
			tmap.put(s,mm.get(s));
			
		}
		return tmap;
	}

	@Override
	public Set<Entry<String, Integer>> ByCapacityKeysort() {
	
		Set<Map.Entry<String, Integer>>es=mm.entrySet();
		
		
		Comparator<Map.Entry<String, Integer>> c=(o1,o2)->{
			
			return o1.getValue()-o2.getValue();
		};
		
		Set<Map.Entry<String, Integer >>tset=new TreeSet<>(c);
			
		for(Map.Entry<String, Integer> e:es) {
		tset.add(e);
		}
		
		  return tset;
	}

	@Override
	public boolean RemoveByName(String cname) {
		
		int cnt=0;
		Integer val=mm.remove(cname);
		return val!=null;
	}

	@Override
	public boolean RemoveByCapacity(int cap) {
	  Set<String> keys=mm.keySet();
	  int cnt=0;
	  Iterator<String> it=keys.iterator();
	  while(it.hasNext())
	  {
		  String s=it.next();
		  if(mm.get(s)==cap)
		  {
			  it.remove();
			  cnt++;
		  }
	  }
	  return cnt>0;
	}
	  
	

}
