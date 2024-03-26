package exception;

public class Ex05 {
	public static void main(String[] args) {
		
		try {
			login("aaa","12345");
		} catch (LoginException e) {
			e.printStackTrace();
			System.out.println("다시 로그인 페이지로 이동");
		} finally {
			System.out.println("무조건 실행된다!!");
		}
		
	}
	
	static void login(String id, String pw) throws LoginException{
		if(id.equals("aaa")&& pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			throw new LoginException("유효하지 않은 회원 정보!");
		}
	}
}
