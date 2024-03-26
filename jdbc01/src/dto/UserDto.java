package dto;
//USER_ID NUMBER,
//LOGIN_ID VARCHAR2(1000),
//PASSWORD VARCHAR2(1000),
//NAME VARCHAR2(300),
//AGE NUMBER,
//GENDER CHAR(1) DEFAULT 'N',
//BIRTH DATE,

//DTO는 데이터를 전송하기 위한 목적으로 사용한다.
//다른 기능은 넣지 않는다.

public class UserDto {
	private int userId;
	private String loginId;
	private String password;
	private String name;
	private int age;
	private String gender;
	private String birth;
	
	
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getLoginId() {
		return loginId;
	}
	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", loginId=" + loginId + ", password=" + password + ", name=" + name
				+ ", age=" + age + ", gender=" + gender + ", birth=" + birth + "]";
	}
	
	
}


























