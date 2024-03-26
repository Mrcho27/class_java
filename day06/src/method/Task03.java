package method;

public class Task03 {
	public static void main(String[] args) {
		
		String str = "abcde";
		
		System.out.println(str.length()); // 문자열의 길이를 반환하는 메소드
		System.out.println(str.charAt(2)); //인덱스번호로 특정 문자를 반환하는 메소드
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(str.charAt(i));
		}
		
		System.out.println("================================");
		
		System.out.println(changeCase("BaNana"));
		
		login("admin",1234);
		
	}
	
//소문자를 대문자로, 대문자를 소문자로 바꿔주는 메소드
//	BaNanA -> bAnANa
	static String changeCase(String str) {
		String result = "";
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(c >= 'a' && c<= 'z') {
				result += (char)(c - 32);
			}else if(c>= 'A' && c<= 'Z') {
				result += (char)(c + 32);
			}else {
				result += c;
			}
		}
		return result;
	}
	
//	아이디 비밀번호를 넘겨받아 일치하는지 확인하기
	static void login(String id, int pw) {
		if(id.equals("admin")  &&pw == 1234) {
			System.out.println("환영합니다!");
		}else {
			System.out.println("회원 정보를 다시 확인하세요!");
		}
	}
	
	
	
}






















