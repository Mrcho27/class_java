package objectArray;

class Member{
	int number;
	String name;
	int age;
	String address;
	
	public Member(int number, String name, int age, String address) {
		this.number = number;
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void showInfo() {
		System.out.println(number + "."+name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
	}
	
}

public class Ex03 {
	public static void main(String[] args) {
		Member member1 = new Member(1, "홍길동", 22, "노원구");
		Member member2 = new Member(2, "김철수", 22, "강남구");
		Member member3 = new Member(3, "김영희", 22, "성북구");
		
//		member1.showInfo();
//		member2.showInfo();
//		member3.showInfo();
		
		Member[] members = {member1, member2, member3};
		
		for(int i=0; i<members.length; i++) {	
			System.out.println(members[i]);
			members[i].showInfo();
		}
		
		
	}
}
























