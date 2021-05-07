package HomeworkDay5_1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import HomeworkDay5_1.dataAccess.abstracts.UserDao;
import HomeworkDay5_1.entities.concretes.User;

public class DataUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();
	
	public DataUserDao() {
		users = new ArrayList<User>();
	}

	@Override
	public void register(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Registered with DataUserDao. ");
	
	}

	@Override
	public void login(User user) {	
		System.out.println(user.getFirstName() + " " + user.getLastName() + " Logged in with DataUserDAO. ");
	
	}

	@Override
	public User getUser(int id) {
		
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public User getUserByEmail(String email) {
		
		for (User user : users) {
			if (user.getEmail().equals(email)) {
				return user;
			}
		}
		
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return users;
	}

	
}
