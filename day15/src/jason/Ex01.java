package jason;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Ex01 {
	public static void main(String[] args) {
		Map<String,String> user = new HashMap<String,String>();
		
		user.put("id","aaa");
		user.put("pw","1234");
		user.put("name","홍길동");
		
		System.out.println(user);
		
		JSONObject jsonObj = new JSONObject(user);
		System.out.println(jsonObj);
		
//		String test = "{\"name\":\"홍길동\",}";
		
		System.out.println(jsonObj.get("name"));
		
		Map<String,String> user2 = new HashMap<String, String>();
		user2.put("name", "김철수");
		user2.put("id", "bbb");
		user2.put("pw", "1234");
		
		JSONObject jsonObj2 = new JSONObject(user2);
		
		JSONArray jsonAr = new JSONArray();
		
		jsonAr.add(jsonObj);
		jsonAr.add(jsonObj2);
		
		System.out.println(jsonAr);
		System.out.println(jsonAr.get(0));
		
		
		
	}
}























