package HomeworkDay5_1.core.emailVerification;

public interface EmailService {
	void sendVerificationMail(String email);
	boolean isVerified(String option);
}
