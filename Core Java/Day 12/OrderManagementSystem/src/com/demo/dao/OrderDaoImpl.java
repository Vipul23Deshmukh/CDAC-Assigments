package com.demo.dao;

import java.util.*;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Items;

public class OrderDaoImpl implements OrderDao {

	static Map<Customer,List<Items>>hm;
	
	static {
		
		hm=new HashMap<>();
		
		Customer c1=new Customer(1,"Vipul","444777889");
		
		List<Items>lst1=new ArrayList<>();
		lst1.add(new Items(101,"Laptop",45,77777));
		lst1.add(new Items(102,"mobile",741,5254));
	    hm.put(c1, lst1);
		
		
		Customer c2=new Customer(2,"suyogai","9130974599");
		
		List<Items>lst2=new ArrayList<>();
		lst2.add(new Items(1001,"Pavbjaji",5,50));
		lst2.add(new Items(1002,"MIsal",15,180));
	    hm.put(c2, lst2);
	  
	    
	}
	
	@Override
	public boolean save(Customer c, List<Items> lst) {
		
		if(!hm.containsKey(c)) {
			hm.put(c, lst);
			return true;
		}
		
		return false;
	}

	@Override
	public Map<Customer, List<Items>> showAll() {
		
		return hm;
	}

	@Override
	public Entry<Customer, List<Items>> ShowByCustomer(int cid) {
		Set<Map.Entry<Customer,List<Items>>> cset=hm.entrySet();
		
		for(Map.Entry<Customer,List<Items>> e:cset)
		{
			if(e.getKey().getCid()==cid)
			{
				return e;
			}
		}
		return null;
	}



	@Override
	public boolean DeleteByCid(int cid) {
	    List<Items> lst=hm.remove(new Customer(cid));
	    
		return lst!=null;
	}

	@Override
	public boolean AddNewitems(int cid, Items items) {
	  List<Items> lst=hm.get(new Customer(cid));
	  
	  if(lst!=null) {
		  lst.add(items);
		  return true;
	  }
		return false;
	}

	@Override
	public boolean RemoveItembyID(int rid, int iid) {
	
		
		List<Items> lst=hm.get(new Customer(rid));
		
		if(lst!=null) {
		return	lst.remove(new Items(iid));
			
		}
		return false;
	}

	

}
