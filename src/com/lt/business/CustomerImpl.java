package com.lt.business;

import com.lt.bean.Customer;

public class CustomerImpl  implements CustomerInterface {

	
	Customer customers []= new Customer[3];
	//insert in customer
	@Override
	public String createCustomer() {
		
		
		  customers[0] = new Customer();
	        customers[0].setCustomerId(101);
	        customers[0].setCustomerName("Akhilesh");
	        customers[0].setCustomerAddress("Hydrabad");
		
		System.out.println("inserted 1");
		
		
	        customers[1] = new Customer();
	        customers[1].setCustomerId(102);
	        customers[1].setCustomerName("Sonu");
	        customers[1].setCustomerAddress("Bangalore");
		  
	        System.out.println("inserted 2");
		  
	        customers[2] = new Customer();
	        customers[2].setCustomerId(103);
	        customers[2].setCustomerName("akhil");
	        customers[2].setCustomerAddress("Bangalore");
		  
		  System.out.println("inserted 3");
		 
		
		return null;
	}

	//@Override
	/*
	 * public boolean deleteCustomer(int customerid) { // TODO Auto-generated method
	 * for (Customer cust : customer) { if (cust.getCustomerId()==customerid) {}
	 * this.customer.remove(cust);
	 * 
	 * }
	 * 
	 * stub return false; }
	 */

	@Override
	public String listCustomer() {
		
 System.out.println("list of customer");

			    // List Customer Logic
			   	for(Customer  custdt : customers){
			
			   		System.out.println("details of Customer--> " +custdt.getCustomerId() + "  " +custdt.getCustomerName()+ "  " +custdt.getCustomerAddress());
				}
		
		return "print customer list";
	}

//update customer	
	  @Override public String updateCustomer(int customerid) { // TODO
		  
		  System.out.println("running update");
		  for (Customer cust : customers) {
			  if (cust.getCustomerId()==customerid) {
			  cust.setCustomerName(" Akshya ");
			  cust.setCustomerAddress("delhi  ");
			  }
			  
		  } 
	  return "update script"; }

@Override
public boolean deleteCustomer(int customerID) {
	    //String temp []=null;
	 for (int i = 0; i < customers.length; i++) {
         if (customers[i] != null && customers[i].getCustomerId()==(customerID)&& i+1<customers.length){
            
            customers[i] =customers[i+1];
            customers[i+1]=null;
           break;
          
         }
         else if(customers[i] != null && customers[i].getCustomerId()==(customerID)&& i+1==customers.length)
      
         {
           customers[i]=null;
         }
         }
 
  return true;
  }
	 
	
	

}
