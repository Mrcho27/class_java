package test;

import java.util.List;

import dao.UserDao;
import dto.UserDto;

public class DaoTest {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		
		boolean isTrue = userDao.checkId("qwer");
		System.out.println(isTrue);
		
		
		UserDto userDto = new UserDto();
		userDto.setLoginId("www");
		userDto.setPassword("1234");
		userDto.setAge(22);
		userDto.setBirth("2000-01-24");
		userDto.setGender("M");
		userDto.setName("test");
		
//		userDao.join(userDto);
		
		int userId = userDao.login("qqq", "1234");
		System.out.println(userId);
		
		List<String>loginIdList = userDao.findLoginId("test"	, "2000-01-24");
		System.out.println(loginIdList);
		
		
		UserDto updateInfo = new UserDto();
		updateInfo.setLoginId("update");
		updateInfo.setPassword("1234");
		updateInfo.setAge(99);
		updateInfo.setBirth("1988-01-24");
		updateInfo.setGender("F");
		updateInfo.setName("update");
		updateInfo.setUserId(1);
		
//		userDao.update(updateInfo);
		
		UserDto foundUser = userDao.findById(1);
		System.out.println(foundUser);
		
		
		if(userDao.delete(10)) {
			System.out.println("회원 탈퇴 완료!!");
		}else {
			System.out.println("유효하지 않은 회원 번호입니다!!");
		}
		
		
	}
}

























