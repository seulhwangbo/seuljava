package ch09_ex03;

public class String5 {

	public static void main(String[] args) {
						//0123456
		String fullName = "Hello.java";
		int index = fullName.indexOf('.');
		System.out.println("index => " + index);
		String fileName = fullName.substring(0,index);
		
		String ext = fullName.substring(index+1);
		System.out.println(fullName + "의 확장자를 제외한 이름은 " + fileName);
		System.out.println(fullName + "의 확장자는 " + ext);

	}

}
