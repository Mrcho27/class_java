package interTask;

/*
 * 이 인터페이스를 구현한 클래스 3개를 만든다.
 * 
 * 1.BasicFan 클래스
 * 		on : 버튼으로 전원켜기 출력
 * 		off : 버튼으로 전원 끄기 출력
 * 		turbo : 비워두기
 * 2.BasicFan2 클래스
 * 		on : 버튼으로 전원켜기 출력
 * 		off : 버튼으로 전원 끄기 출력
 * 		turbo :  터보 출력
 * 3.SmartFan 클래스
 * 		on : 음성인식으로 전원켜기 출력
 * 		off : 음성인식으로 전원 끄기 출력
 * 		turbo : 터보 출력
 */

public interface Fan {
	void on();
	void off();
	void turbo();
}
