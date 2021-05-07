package HomeworkDay5_1.business.abstracts;

import java.util.List;

import HomeworkDay5_1.entities.concretes.User;

public interface UserService {
	void register(User user);
	void login(User user);
	User getUser(int id);
	User getUser(String email);
	List<User> getAll();
}
