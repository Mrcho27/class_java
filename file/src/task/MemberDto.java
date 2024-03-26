package task;

public class MemberDto {
	private int memberNumber;
	private String memberId;
	private String memberPassword;
	private String memberName;
	private int memberAge;
	private String memberPhoneNumber;
	
	
	public MemberDto(int memberNumber, String memberId, String memberPassword, String memberName, int memberAge,
			String memberPhoneNumber) {
		super();
		this.memberNumber = memberNumber;
		this.memberId = memberId;
		this.memberPassword = memberPassword;
		this.memberName = memberName;
		this.memberAge = memberAge;
		this.memberPhoneNumber = memberPhoneNumber;
	}


	public int getMemberNumber() {
		return memberNumber;
	}


	public String getMemberId() {
		return memberId;
	}


	public String getMemberPassword() {
		return memberPassword;
	}


	public String getMemberName() {
		return memberName;
	}


	public int getMemberAge() {
		return memberAge;
	}


	public String getMemberPhoneNumber() {
		return memberPhoneNumber;
	}


	@Override
	public String toString() {
		return memberNumber +  ", " + memberId + ", "
				+ memberPassword + ", " + memberName + ", " + memberAge + ", "
				+ memberPhoneNumber ;
	}
	
	
	
	public static MemberDto makeDto(String line) {
		String[] arData = line.split(", ");
		return new MemberDto(Integer.parseInt(arData[0]),arData[1],arData[2],arData[3],Integer.parseInt(arData[4]),
				arData[5]);
	}
}
