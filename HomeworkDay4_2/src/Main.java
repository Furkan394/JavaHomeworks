import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdapter;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setFirstName("Furkan Emre");
		customer.setLastName("Çakýroðlu");
		customer.setDateOfBirth("2000,12,12");
		customer.setNationalityId("12345678910");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer);

	}

}
