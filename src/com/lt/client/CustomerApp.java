package com.lt.client;

import com.lt.business.CustomerImpl;
import com.lt.business.CustomerInterface;

public class CustomerApp {

	public static void main(String[] args) {
		
		
		CustomerInterface customeri=new CustomerImpl();
		System.out.println("create customer calling");
		
		System.out.println(customeri.createCustomer());
		
		System.out.println("list customer calling");
		System.out.println(customeri.listCustomer());
		
		  System.out.println("update customer calling");
		  System.out.println(customeri.updateCustomer(102));
		 
			System.out.println("updated");
			System.out.println(customeri.listCustomer());
	
		  System.out.println("deleting operation");
		  System.out.println(customeri.deleteCustomer(102));
		  
		  System.out.println("updated");
			System.out.println(customeri.listCustomer());
		 
		
		
		// TODO Auto-generated method stub

	}

}
