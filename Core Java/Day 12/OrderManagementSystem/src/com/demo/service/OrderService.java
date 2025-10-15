package com.demo.service;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.demo.beans.Customer;
import com.demo.beans.Items;

public interface OrderService {

	boolean AddCustomer();

	Map<Customer, List<Items>> displayAll();

	Entry<Customer, List<Items>> displayByCustomer(int cid);

	boolean DeleteByCustomer(int cid);

	boolean AddNewItem(int cid, Items items);

	boolean RemoveById(int rid, int iid);

	

}
