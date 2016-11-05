package zttc.itat.user.service;

import org.junit.Before;
import org.junit.Test;

import zttc.itat.user.model.User;

public class UserServiceTest {
	private IUserService userService;
	private User u ;
	@Before
	public void setUp(){
//		userDao = createStrictMock(IUserDao.class);
		userService = new UserService();
		u = new User();
		u.setNickname("bb");
		u.setUsername("gg");
		u.setPassword("123456");
	}


	@Test
	public void testAdd() {
//		userDao.add(u);
//		expectLastCall();
//		replay(userDao);
		userService.add(u);
	}

	@Test
	public void testLoadByUsername() {
//		expect(userDao.loadByUsername("gg")).andReturn(u);
//		replay(userDao);
		User tu = userService.loadByUsername("gg");
		System.out.println(tu);
		
	}

}
