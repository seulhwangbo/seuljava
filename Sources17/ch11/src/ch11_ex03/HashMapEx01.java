package ch11_ex03;

import java.util.HashMap;

public class HashMapEx01 {

	public static void main(String[] args) {
		HashMap<String, String> hm01 = new HashMap<String, String>();
		// 		k = key 뒤에건 V = value
		hm01.put("이승우", "010-2222-3333");
		hm01.put("손흥민", "010-3333-3333");
		hm01.put("전지현", "010-4455-3333");
		hm01.put("전지현", "010-4455-2233");
		hm01.put("전지현3", "010-4455-2233");
		
		System.out.println("이승우  TEL: "+hm01.get("이승우"));
		System.out.println("손흥민  TEL: "+hm01.get("손흥민"));
		System.out.println("전지현  TEL: "+hm01.get("전지현"));
		System.out.println("전지현3 TEL: "+hm01.get("전지현3"));
	}

}
