package ch11_ex02;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx01 {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		hs.add("구렁2");
		hs.add("고양이");
		hs.add("야옹이");
		hs.add("구렁2");
		hs.add("진돗개");
		hs.add("멍멍이");
		
		for(String str : hs) {
			System.out.println(str);
		}
		System.out.println("=========== Advanced ========== ");
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
