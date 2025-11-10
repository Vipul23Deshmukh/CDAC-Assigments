package test;

import Hashing.MyHashTable;

public class TestMyHashTable {

	public static void main(String[] args) {
	MyHashTable mht=new MyHashTable();
	mht.insertData(111);
	mht.insertData(10);
	mht.insertData(5);
	mht.insertData(7);
	mht.insertData(14);
	mht.insertData(21);
	
	mht.DisplayTables();
	mht.searchData(10);
	mht.searchData(11);
	
	
	
	
	mht.insertData(45);
	mht.insertData(47);
	mht.insertData(2);
	mht.insertData(3);
	mht.insertData(7);
	mht.insertData(21);
	mht.insertData(25);
	mht.insertData(15);
	mht.insertData(12);
	mht.insertData(11);
	mht.insertData(48);
	mht.insertData(55);
	
	mht.searchData(25);
	mht.searchData(100);


	}

}
