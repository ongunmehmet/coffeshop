package Service;

import java.util.ArrayList;
import java.util.List;

import Database.IDataAccess;
import Database.NeroDataBase;
import Entities.Customer;

public class NeroCustomerManager implements ICustomerService {
	private IDataAccess database;
	
	
    public NeroCustomerManager(IDataAccess database) {
		this.database = database;
	}

	@Override
	public void add(Entities.Customer customer) {
		database.add(customer);
		
	}

	@Override
	public void delete(Entities.Customer customer) {
		database.delete(customer);
		
	}

	@Override
	public void update(Entities.Customer customer) {
		database.update(customer);
		
	}

}
