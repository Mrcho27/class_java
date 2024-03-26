package date;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

public class Ex02 {
	public static void main(String[] args) {
		Calendar today  = Calendar.getInstance(); //Calendar 클래스의 객체찍는 방법(Singleton 패턴)
		
//		System.out.println(today);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy=MM=dd");
		String todayStr = sdf.format(today.getTime());
		
		System.out.println(todayStr);
		
//		Calendar클래스에서 월을 나타낼때 0~11로 나타낸다.
		today.set(2000, 11,8);
		System.out.println(sdf.format(today.getTime()));
	
		today.set(Calendar.MONTH, 8);
		System.out.println(sdf.format(today.getTime()));
		
		System.out.println(today.get(Calendar.MONTH)+1);
		
//		add()
//		날짜 연산
		today.add(Calendar.DATE, -30);
		
		System.out.println(sdf.format(today.getTime()));
		
		LocalDate localDate =LocalDate.of(2024, 11, 14);
		System.out.println(localDate);
		
	}
}
