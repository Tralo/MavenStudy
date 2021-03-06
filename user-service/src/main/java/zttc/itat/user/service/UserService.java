package zttc.itat.user.service;

import zttc.itat.user.dao.IUserDao;
import zttc.itat.user.dao.UserDao;
import zttc.itat.user.model.User;

public class UserService implements IUserService{
	
	private IUserDao userDao;
	
	public UserService() {
		this.userDao = new UserDao();
	}

	public void add(User user) {
		userDao.add(user);
	}

	public User loadByUsername(String username) {
		return userDao.loadByUsername(username);
	}

}
