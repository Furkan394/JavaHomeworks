package HomeworkDay5_1.business.concretes;


import java.util.Scanner;
import java.util.regex.Pattern;

import HomeworkDay5_1.business.abstracts.AuthService;
import HomeworkDay5_1.business.abstracts.UserService;
import HomeworkDay5_1.core.adapters.AuthServiceAdapter;
import HomeworkDay5_1.core.emailVerification.EmailService;
import HomeworkDay5_1.entities.concretes.User;


public class AuthManager implements AuthService{

	private UserService userService;
	private AuthServiceAdapter authServiceAdapter;
	private EmailService emailService;
	public AuthManager(UserService userService, AuthServiceAdapter authServiceAdapter, EmailService emailService) {
		super();
		this.userService = userService;
		this.authServiceAdapter = authServiceAdapter;
		this.emailService = emailService;
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		User registerUser = new User(id, firstName, lastName, email, password);
		if (!fillAllInformation(registerUser.getFirstName(), registerUser.getLastName(), registerUser.getEmail(),
				registerUser.getPassword())) {
			return;
		}
		if (!nameLengthValid(registerUser.getFirstName(), registerUser.getLastName())) {
			return;
		} else if (!checkEmailFormat(registerUser.getEmail())) {
			return;
		} else if (!existEmail(registerUser.getEmail())) {
			return;
		} else if (!passwordLengthValid(registerUser.getPassword())) {
			return;
		} else {
			this.emailService.sendVerificationMail(registerUser.getEmail());

			Scanner scanner = new Scanner(System.in);
			System.out.println("Your verification code: '12345'. Please go to the site again to activate your account.");
			String option = scanner.nextLine();

			if (this.emailService.isVerified(option)) {
				this.userService.register(registerUser);
			} else {
				System.out.println("Registration failed.");
			}
		}
	}

	private boolean existEmail(String email) {
		if (userService.getUser(email) == null) {
			return true;
		}
		System.out.println("This e-mail address is already registered in the system.");
		return false;
	
	}

	private boolean checkEmailFormat(String email) {
		String regex = "^[A-Za-z0-9+_.-]+@(.+)$";
		Pattern pattern = Pattern.compile(regex);

		if (pattern.matcher(email).matches()) {
			return true;
		}
		else {
		System.out.println("Email address is invalid.");
		return false;
		}
	}

	private boolean nameLengthValid(String firstName, String lastName) {
			if (firstName.length() >= 2 && lastName.length() >= 2) {
				return true;
			}
			System.out.println("Your name and surname must be at least 2 characters.");
			return false;
		
	}

	private boolean fillAllInformation(String firstName, String lastName, String email, String password) {
		if (firstName.length() > 0 && lastName.length() > 0 && email.length() > 0 && password.length() > 0) {
			return true;
		}
		else {
		System.out.println("Please fill in all blank fields.");
		return false;
		}
	}
		

	private boolean passwordLengthValid(String password) {
		if (password.length() >= 6) {
			return true;
		}
		else{
		System.out.println("Your password must be at least 6 characters.");
		return false;
		}
	}

	@Override
	public void login(String email, String password) {
		User loginUser = userService.getUser(email);
		if (loginUser == null) {
			System.out.println("You entered an invalid user.");
		} else if (email.length() <= 0 || password.length() <= 0) {
			System.out.println("Fill in all fields and try again.");
		} else if (loginUser.getEmail() != email) {
			System.out.println("You entered an incorrect e-mail.");
		} else if (loginUser.getPassword() != password) {
			System.out.println("You entered an incorrect password.");
		}
		System.out.println(
					"You have successfully logged into the system: " + loginUser.getFirstName() + " " + loginUser.getLastName());
			
	}

	@Override
	public void loginWithGoogle(String email) {
		authServiceAdapter.login(email);

	}

	@Override
	public void register(String email) {
		authServiceAdapter.register(email);

	}

}
