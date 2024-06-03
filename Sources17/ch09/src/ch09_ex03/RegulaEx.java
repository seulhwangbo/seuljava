package ch09_ex03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaEx {

	public static void main(String[] args) {
		String [] data = {"bat", "baby", "bonus"
						, "cA", "ca", "co", "c."
						, "c0", "car", "combat", "count"
						, "date","disc"};
		
		Pattern p = Pattern.compile("c[a-z]*");
		// c 로 시작하는 소문자영단어
		for(int i=0; i < data.length; i++) {
				Matcher m = p.matcher(data[i]);
				// 패턴에 맞는 애들만 넘겨주게 된다.
				if(m.matches()){
				System.out.println(data[i] + ",");
				}
			}
	}

}
