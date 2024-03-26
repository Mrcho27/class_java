package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) throws Exception{
//		기본 생성자 사용 시 현재 시간을 담고 있는 객체를 생성한다.
//		Date today = new Date();
//		System.out.println(today);
//		
//		SimpleDateFormat 날짜 형식
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
//		String todayForm = sdf.format(today);
//		System.out.println(todayForm);
//		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy년 MM/dd - HH:mm:ss");
//		Date -> String
		Date today = new Date();
		System.out.println(sdf.format(today));
		
		
//		String -> Date
		String timeStr = "20년 02/20 - 09:36:40";
//		parse() 분석
		Date myDay = sdf.parse(timeStr);
		System.out.println(myDay);
		
//		현재 시간을 특정 시간(1970/1/1)을 기준으로 얼마나 흘렀는지 밀리초로 알려준다.
		System.out.println(System.currentTimeMillis());
		
		Date d1 = new Date(System.currentTimeMillis());
		System.out.println(d1);
		
		d1.setDate(1);
		
		System.out.println(d1);
		
	}
}
