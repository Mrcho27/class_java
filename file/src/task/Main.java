package task;

public class Main {
	public static void main(String[] args) throws Exception{
		MemberDto memberDto1 = new MemberDto(1, "aaa", "1234", "홍길동", 12, "01011112222");
		MemberDto memberDto2 = new MemberDto(2, "bbb", "1234", "신짱구", 22, "01033332222");
		
		MemberDao memberDao = new MemberDao();
		
//		memberDao.join(memberDto1);
//		memberDao.join(memberDto2);
		
		
		System.out.println(memberDao.checkId("aaa"));
		System.out.println(memberDao.findIdByPhoneNumber("01011112222"));
		System.out.println(memberDao.findPassword("aaa", "01011112222"));
	}
}
