package task;

public class UserDto {
//	Alt Shift A 멀티커서
	private String id;
	private String pw;
	private String name;
	private int age;
	
	public UserDto(String id, String pw, String name, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.age = age;
		
	}

	public String getId() {
		return id;
	}

	public String getPw() {
		return pw;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "UserDto [id=" + id + ", pw=" + pw + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
