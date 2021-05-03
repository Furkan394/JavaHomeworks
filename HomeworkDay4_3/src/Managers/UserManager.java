package Managers;

import Entities.User;
import Services.UserValidationService;
import Services.UserService;

public class UserManager implements UserService{

	private UserValidationService userCheck;
	
	public UserManager(UserValidationService userCheck) {
		this.userCheck = userCheck;
	}

	@Override
	public void register(User user) {
		
		if (userCheck.userValidation(user)) {
			System.out.println("User registered : " + user.getFirstName() + " " + user.getLastName());
		}else {
			System.out.println("Not a valid person");
		}
	}

	@Override
	public void update(User user) {
		
		if (userCheck.userValidation(user)) {
			System.out.println("User updated : " + user.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

	@Override
	public void delete(User user) {
		
		if (userCheck.userValidation(user)) {
			System.out.println("User deleted : " + user.getFirstName());
		}else {
			System.out.println("Not a valid person");
		}
		
	}

}
