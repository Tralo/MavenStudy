package zttc.itat.user.dao;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import zttc.itat.user.model.User;

public class UserDaoTest {

	private IUserDao userDao;

	@Before
	public void setUp() {
		userDao = new UserDao();
		
	}

	@Test
	public void testAdd() {
		User u = new User();
		u.setNickname("aa");
		u.setPassword("123456");
		u.setUsername("xiaowei");
		userDao.add(u);
	}

	@Test
	public void testLoadByUsername() {
		User user = userDao.loadByUsername("xiaowei");
		System.out.println(user);
	}

}
