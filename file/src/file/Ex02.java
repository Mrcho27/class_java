package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex02 {
	public static void main(String[] args) {
		File f = new File("test.txt");
		
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
		
		try {
			FileOutputStream fos = new FileOutputStream(f);
			fos.write('가');
			fos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
}
