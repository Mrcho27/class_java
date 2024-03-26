package task;

/*
 * UserDto 클래스를 선언한다.
 * -아이디, 비밀번호,이름,나이
 * -모든 필드는 private이며 생성자를 통해서만 초기화 가능
 * -toString()을 재정의하여 모든 필드의 값을 확인할 수 있도록 만든다.
 * -모든 필드의 getter메소드를 생성한다.
 * 
 * UserDao 클래스를 선언한다
 * - 회원 정보를 저장할 List를 Private으로 선언한다.
 * - 아이디 중복검사 메소드 정의
 * - 회원가입 메소드 정의
 * - 로그인 메소드 정의
 */

public class Main {
	public static void main(String[] args) {
		UserDao userDao = new UserDao();
		UserDto userDto = new UserDto("aaa","1234","홍길동",22);
		UserDto userDto2 = new UserDto("bbb","1234","김철수",24);
		
	
		userDao.join(userDto);
		userDao.join(userDto2);
		
		UserDto userDto3 = new UserDto("aaa","1234","홍길동",22);
		
		if(userDao.checkId(userDto3.getId())) {
			userDao.join(userDto3);
			System.out.println("가입이 완료되었습니다.");
		}else {
			System.out.println("중복된 아이디입니다.");
		}
		
		userDao.printUserInfo();
		
		
		UserDto foundUser = userDao.login("bbb", "1234");
		
		if(foundUser != null) {
			System.out.println(foundUser.getName() + "님 환영합니다!");
		}else {
			System.out.println("로그인 실패!");
		}
		
	}
}























