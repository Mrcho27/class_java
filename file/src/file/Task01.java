package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task01 {
	public static void main(String[] args) throws IOException{
//		현재 경로에 animal.txt 파일을 생성하고,
//		파일 내욜은 사슴, 고라니, 너구리, 토끼 4가지 동물을 작성한다.
//		각 동물은 줄 바꿈 후 당므 동물을 넣도록한다.
		BufferedWriter bw = new BufferedWriter(new FileWriter("animal.txt") );
		String[] animals = {"사슴", "고라니", "너구리", "토끼"};
		
		for(String animal : animals) {
			bw.write(animal);
			bw.newLine();
		}
		
		bw.close();
		
		BufferedReader br = new BufferedReader(new FileReader("animal.txt"));
		
		String line = null;
		while((line =br.readLine()) !=null) {
			System.out.println(line);
		}
		
		
//      while(true) {
//      String line = br.readLine();
//      if(line == null) { break; }
//      System.out.println(line);
//   }
		
		br.close();
		
		
	}
}
