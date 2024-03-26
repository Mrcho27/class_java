package task;

import java.util.ArrayList;
import java.util.List;

public class UserDao {
// 모든 회원정보를 저장하는 리스트
	private List<UserDto> userList = new ArrayList<>();
	
//	아이디 중복 검사
	public boolean checkId(String id) {
//		모든 회원 정보를 하나씩 가져와 user변수에 담는다.
		for(UserDto user : userList) {
//			user변수에 담긴 id값을 매개변수로 받아온 id와 비교한다.
			if(user.getId().equals(id)) {
				return false;
			}
		}
		return true;
	}
	
	
//	회원 가입
	public void join(UserDto userDto) {
		userList.add(userDto);
		
	}
	
//	로그인
	public UserDto login(String id, String pw) {
		for(UserDto user : userList) {
			if(user.getId().equals(id)&&user.getPw().equals(pw)) {
				return user;
			}
		}
		
		return null;
	}
	
	
//	회원 목록 조회
	public void printUserInfo() {
		System.out.println(userList);
	}
	
	
}


















