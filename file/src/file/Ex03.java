package file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03 {
	public static void main(String[] args) throws IOException{
//		2바이트 (문자) 단위로 데이터 전송
		FileWriter fw = new FileWriter(new File("test2.txt"));
		
//		문자열을 입력하면 알아서 문자단위로 전송한다.
		fw.write("안녕하세요");
		fw.close();
		
		FileReader fr = new FileReader("test2.txt");
		System.out.println(  (char)fr.read()  );
		fr.close();
	}
}
