package HomeworkDay5_1.business.concretes;

import java.util.List;

import HomeworkDay5_1.business.abstracts.UserService;
import HomeworkDay5_1.dataAccess.abstracts.UserDao;
import HomeworkDay5_1.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;

	public UserManager(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void register(User user) {
		userDao.register(user);
		
	}

	@Override
	public void login(User user) {
		userDao.login(user);
		
	}

	@Override
	public User getUser(int id) {
		
		return userDao.getUser(id);
	}

	@Override
	public User getUser(String email) {
		
		return userDao.getUserByEmail(email);
	}

	@Override
	public List<User> getAll() {
		
		return userDao.getAll();
	}
	

	
}
