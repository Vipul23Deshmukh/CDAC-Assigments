package com.demo.dao;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Items;

public interface OrderDao {

	boolean save(Customer c, List<Items> lst);

	Map<Customer, List<Items>> showAll();

	Entry<Customer, List<Items>> ShowByCustomer(int cid);



	boolean DeleteByCid(int cid);

	boolean AddNewitems(int cid, Items items);

	boolean RemoveItembyID(int rid, int iid);

}
