package Database;

import Entities.Customer;

public interface IDataAccess {
	void add(Customer customer);
	void delete (Customer customer);
	void update (Customer customer);

}
