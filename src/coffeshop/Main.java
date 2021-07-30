package coffeshop;

import Database.StarDataBase;
import Entities.Customer;
import Service.ICustomerService;
import Service.StarbucksCustomerManager;

public class Main {
	public static void main(String[] args) {


	Customer customer= new Customer();
	customer.setId(1);
	customer.setName("mehmet");
	customer.setSurName("ongun");
	customer.setNationalIdentity("11111111111");
	customer.setStarCount(1);
	ICustomerService customerManager= new StarbucksCustomerManager(new StarDataBase());
	customerManager.add(customer);
	customer.setStarCount(10);
	customerManager.update(customer);
	;
	
	
			
	
			

	}

}
