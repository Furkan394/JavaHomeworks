package HomeworkDay5_1;

import HomeworkDay5_1.business.abstracts.AuthService;
import HomeworkDay5_1.business.concretes.AuthManager;
import HomeworkDay5_1.business.concretes.UserManager;
import HomeworkDay5_1.core.adapters.GoogleAuthManagerAdapter;
import HomeworkDay5_1.core.emailVerification.EmailManager;
import HomeworkDay5_1.dataAccess.concretes.DataUserDao;

public class Main {

	public static void main(String[] args) {
		
		AuthService authService = new AuthManager(new UserManager(new DataUserDao()),
					new GoogleAuthManagerAdapter(), new EmailManager());
		
		String googleAccount = "furkan@gmail.com";
		authService.register(googleAccount);
		authService.loginWithGoogle(googleAccount);
		
		authService.register(1, "Furkan", "Çakýroðlu", "furkan..com", "123456"); //email warning
		authService.register(2, "Emre", "Çakýr", "furkan@gmail.com", "12"); //password warning
		authService.register(3, "E", "Çakýr", "furkan@gmail.com", "123456"); //firstName warning
		authService.register(4, "Emre", "r", "furkan@gmail.com", "123456"); //lastName warning
		
		authService.register(5, "Emre", "Çakýroðlu", "emre@gmail.com", "123456");
		authService.login("emre@gmail.com", "123456");
		
		authService.register(6, "Furkan Emre", "Çakýroðlu", "emre@gmail.com", "123456"); //exist email warning
		authService.login("emre@gmail.com", "123456");

		
	}

}
