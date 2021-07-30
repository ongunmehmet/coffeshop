package Database;

import java.util.ArrayList;

import Entities.Customer;

public class StarDataBase implements IDataAccess {
     private ArrayList<Customer> database = new ArrayList<Customer> (); 
	
	@Override
	public void add(Customer customer) {
	database.add(customer);
		
	}

	@Override
	public void delete(Customer customer) {
	 database.remove(customer);
		
	}

	@Override
	public void update(Customer customer) {
		database.set(database.indexOf(customer),customer);
	}
}
