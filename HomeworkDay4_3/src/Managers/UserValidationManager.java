package Managers;

import Entities.User;
import Services.UserValidationService;

public class UserValidationManager implements UserValidationService{

	@Override
	public boolean userValidation(User user) {
		
		return true;
	}

}
