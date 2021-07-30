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
			System.out.println("M��teri Eklendi");
			
		}
		else {
			System.out.println("Tc no hatal�");
		}
		
	}

	@Override
	public void delete(Customer customer) {
		database.delete(customer);
		System.out.println("M��teri Silindi");
		
		
	}

	@Override
	public void update(Customer customer) {
		
		
		database.update(customer);
		System.out.println("M��teri G�ncellendi mevcut y�ld�z say�s�" + customer.getStarCount());
	}

}
