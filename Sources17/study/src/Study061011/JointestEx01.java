package Study061011;

import java.util.ArrayList;

class Before extends Thread{
	Before(String str){
		super(str);
	}
	void addCar() {
		System.out.println("addCar");
		Jointest.carlist.add("벤츠");
		Jointest.carlist.add("아우디");
		Jointest.carlist.add("SM7");
		Jointest.carlist.add("포르쉐");
	}
	public void run() {
		System.out.println(getName());
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		} 
		addCar();
	}
}

class After extends Thread{
	After(String str){
		super(str);
	}
	public void run() {
		System.out.println(getName());
		for(String car : Jointest.carlist) {
			System.out.println(car);
		}
	}
}
public class JointestEx01 {
	public static ArrayList<String> carlist = new ArrayList<>();
	
	public static void main(String[] args) {
		Before bf = new Before("우선");
		After af = new After("나중");
		
		bf.start();
	}

}
