import java.util.Date;

import Abstract.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Furkan Emre");
		customer.setLastName("Çakýroðlu");
		customer.setDateOfBirth(new Date(2001, 01, 01));
		customer.setNationalityId("33257363710");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);

	}

}
