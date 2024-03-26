package task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	private BufferedReader br;
	private BufferedWriter bw;
	
//	회원가입
	public void join(MemberDto memberDto) throws Exception{
		bw = MyBuffer.getWriter();
		
		
		bw.write(memberDto.toString());
		bw.newLine();
		bw.close();
	}
	
//	id중복체크
	public boolean checkId(String memberId) throws Exception{
		br = MyBuffer.getReader();
		MemberDto memberDto = null;
		
		while(true) {
			String line =br.readLine();
			if(line==null) {break;}
		memberDto = MemberDto.makeDto(line);
		
		if(memberDto.getMemberId().equals(memberId)) {
			return false;
		}
	}
		return false;
	}
	
//	핸드폰 번호로 아이디 찾기 (하나의 번호로 여러 아이디 가입이 가능하다고 가정)
	public List<String> findIdByPhoneNumber(String memberPhoneNumber)throws Exception{
		br = MyBuffer.getReader();
		MemberDto memberDto = null;
		List<String> memberIds = new ArrayList<String>();
		
		while(true) {
			String line =br.readLine();
			if(line== null) {break;}
			
			memberDto = MemberDto.makeDto(line);
			if(memberDto.getMemberPhoneNumber().equals(memberPhoneNumber)) {
				memberIds.add(memberDto.getMemberId());
			}
		}
		
		br.close();
		
		return memberIds;
		
	}
	
	
//	비밀번호 찾기
	public String findPassword(String memberId,String memberPhoneNumber) throws Exception{
		br= MyBuffer.getReader();
		MemberDto memberDto =null;
		String password = null;
		
		while(true) {
			String line =br.readLine();
			if(line==null) {break;}
			
			memberDto = MemberDto.makeDto(line);
			
			if(memberId.equals(memberDto.getMemberId())&&
					memberPhoneNumber.equals(memberDto.getMemberPhoneNumber())) {
				
				password = memberDto.getMemberPassword();
			}
		}
		
		br.close();
		
		return password;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
