package map;

import java.util.HashMap;
import java.util.Map;

public class Ex02 {
	public static void main(String[] args) {
		Map<String,String> boardMap = new HashMap<String,String>();
		
		boardMap.put("title", "안녕하세요");
		boardMap.put("content", "반갑습니다");
		boardMap.put("writer", "aaa");
	}
}
