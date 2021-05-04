package Abstract;

import entities.Customer;

public interface CustomerCheckService {
	boolean CheckIfRealPerson(Customer customer);
}
