package HomeworkDay5_1.dataAccess.abstracts;

import java.util.List;

import HomeworkDay5_1.entities.concretes.User;

public interface UserDao {
	void register(User user);
	void login(User user);
	User getUser(int id);
	User getUserByEmail(String email);
	List<User> getAll();
}
