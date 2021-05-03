package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager{
	CustomerCheckService checkService;

	public NeroCustomerManager(CustomerCheckService checkService) {
		this.checkService = checkService;
	}
	
	@Override
	public void save(Customer customer) {
		if(checkService.CheckIfRealPerson(customer)) {
			System.out.println("Saved to Database: "+customer.getFirstName());
			
		}else {
			System.out.println("Not a valid person!");
		}

	}
}