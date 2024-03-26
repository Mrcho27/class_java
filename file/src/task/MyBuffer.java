package task;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MyBuffer {
	public static BufferedWriter getWriter() {
		BufferedWriter bw = null;
		
		try {
			bw = new BufferedWriter(new FileWriter("member.txt", true));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return bw;
	}
	
	public static BufferedReader getReader() {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader("member.txt"));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return br;
	}
}
