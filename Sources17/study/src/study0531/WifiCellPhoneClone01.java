package study0531;

public class WifiCellPhoneClone01 extends CellPhoneClone01 {
	
	String wifi;
	
	WifiCellPhoneClone01(String model, String color, String wifi) {
		this.model = model;
		this.color = color;
		this.wifi = wifi;
		
	}
	
	void catchWifi() {
		System.out.println(" 와이파이 신호를 잡는 중 ...");
	}
	
	int showPrice(int price) {
		this.price = price;
		System.out.println("이 핸드폰은 " + price + "원 입니다.");
		return price;
	}
	
	void turnOffWifi() {
		System.out.println("와이파이 신호가 약합니다.");
	}
}
