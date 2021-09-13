package com.lt.business;

import com.lt.bean.Customer;

public interface CustomerInterface {
	
	public String createCustomer();
	public boolean deleteCustomer(int customerid);
	public String listCustomer();
	public String updateCustomer(int customerid);
	

}
