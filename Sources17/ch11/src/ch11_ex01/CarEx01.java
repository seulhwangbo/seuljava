package ch11_ex01;

import java.util.ArrayList;

public class CarEx01 {

	public static void main(String[] args) {
		ArrayList<Car> al = new ArrayList<>();
		al.add(new Car());
		al.add(new Bus());
		al.add(new Taxi());
		
		for (Car c : al) {
			c.print();
			if(c instanceof Bus) {
				//((Bus)c).move();
				// move는 버스만 있는 method
				// 아래 두줄 위 한줄 같은 코드
				 Bus b = (Bus) c;
				 // 캐스팅 후 실행하는 메소드
				 b.move();
			}
		}

	}

}
