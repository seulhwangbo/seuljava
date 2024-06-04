package ch10_ex03;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex03 {

	public static void main(String[] args) {
		FileReader reader;
		char [] buffer = new char[105];
		String file_name = ".classpath";
		// 웬만해서는 try.catch 정말 필요없을 때만 throw
		// try속에 try가 있다면 어떻게 해야 하나
		// 이중 try문은 사용하지 않는다는 것이 중요하다.
		try {
			reader = new FileReader(file_name);
			reader.read(buffer,5,100); // 리더 안에 100바이트를 읽어서 넣어놓겠다
			// callbyRef => 우리가 부르지 않아도 차있다
			// 값을 이용해서 스트링으로 만들고
			// 이를 통해 읽을 수 있게 된다.
			String str = new String(buffer);
			System.out.println("읽은 건" + str);
			reader.close();
		} catch (FileNotFoundException e) {
			System.out.println("그런 파일 없습니당");
		} catch (IOException e) {
			System.out.println("읽다가 에러났슈");
		} finally {
			System.out.println("어쨌거나 읽어유.");
		}

}
}
