package Service;

import Database.IDataAccess;
import Entities.Customer;
import Utils.CustomerUtils;

public class StarbucksCustomerManager implements ICustomerService  {
	private IDataAccess database;
	

	public StarbucksCustomerManager(IDataAccess database) {
		;
		this.database = database;
	}

	@Override
	public void add(Customer customer) {
		
		
		if(CustomerUtils.isNationalIdentityValid(customer.getNationalIdentity()) ) {
			database.add(customer);
			System.out.println("Müþteri Eklendi");
			
		}
		else {
			System.out.println("Tc no hatalý");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		database.delete(customer);
		System.out.println("Müþteri Silindi");
		
		
	}

	@Override
	public void update(Customer customer) {
		
		
		database.update(customer);
		System.out.println("Müþteri Güncellendi mevcut yýldýz sayýsý" + customer.getStarCount());
	}

}
