package task02;

public class Player {
	String name;
	int age;
	String posit;
	String team;
	
	// alt + shift +s 단축키
	public Player(String name, int age, String posit, String team) {
		this.name = name;
		this.age = age;
		this.posit =posit;
		this.team = team;
	}
	
	
	void play() {
		System.out.println(this.name + "선수가 경기에 출전한다.");
	}
	
	void standBy() {
		System.out.println(this.name + "선수가 벤치에서 대기한다.");
	}
	
	void playerInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("나이 : " + this.age);
		System.out.println("포지션 : " + this.posit);
		System.out.println("팀 : " + this.team);
	}

}
