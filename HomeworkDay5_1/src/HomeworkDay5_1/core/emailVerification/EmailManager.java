package HomeworkDay5_1.core.emailVerification;

public class EmailManager implements EmailService{

	@Override
	public void sendVerificationMail(String email) {
		System.out.println("A Verification mail has been sent to the " + email + " mail.");
		
	}

	@Override
	public boolean isVerified(String option) {
		if (option.equals("12345")) {
			System.out.println("Email address verified.");
			return true;
		}
		System.out.println("Warning: Email address could not be verified.");
		return false;
	}

}
