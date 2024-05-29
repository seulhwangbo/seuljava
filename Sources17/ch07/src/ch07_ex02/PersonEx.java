package ch07_ex02;

public class PersonEx {

	public static void main(String[] args) {
		Student st1 = new Student();
		st1.setName("수지");
		st1.setAge(21);
		st1.setSno("1111");
		// st1.name은 private이기 때문에 여기서 따로 정의가 되지 않는다.
		Teacher th1 = new Teacher();
		th1.setName("길동");
		th1.setAge(35);
		th1.setSubject("JAVA");
		
		Manager mg1 = new Manager();
		mg1.setName("원빈");
		mg1.setAge(19);
		mg1.setPart("청소");

		System.out.println("이름 : " + st1.getName() + " , 나이 : " + st1.getAge() +" 학번 : " + st1.getSno());
// 		위를 쓰기보다 아래에 있는 걸 쓰기가 권장, 유지보수의 용이성을 위해서이다.
		th1.printAll();
		mg1.printAll();
	}

}
