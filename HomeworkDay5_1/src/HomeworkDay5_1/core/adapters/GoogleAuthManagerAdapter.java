package HomeworkDay5_1.core.adapters;

import HomeworkDay5_1.googleAuthentication.GoogleAuthenticationManager;

public class GoogleAuthManagerAdapter implements AuthServiceAdapter{

	@Override
	public void register(String email) {
		GoogleAuthenticationManager googleAuthManager = new GoogleAuthenticationManager();
		googleAuthManager.register(email);
	}

	@Override
	public void login(String email) {
		GoogleAuthenticationManager googleAuthManager = new GoogleAuthenticationManager();
		googleAuthManager.login(email);
		
	}

}
