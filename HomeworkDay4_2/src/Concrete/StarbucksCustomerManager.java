package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if (customerCheckService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to database: "+customer.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
	}

	
}
