package study0531;

public class WifiPhoneEX {

	public static void main(String[] args) {
		WifiCellPhoneClone01 newCellPhone = new WifiCellPhoneClone01("아이폰", "초록색", "양호");
		System.out.println("모델: " + newCellPhone.model);
		System.out.println("색상: " + newCellPhone.color);
		//dmbCelPhone 의 필드
		//System.out.println("가격: " + newCellPhone.price);
		
		newCellPhone.powerOn();
		newCellPhone.catchWifi();
		newCellPhone.missedCall();
		newCellPhone.receivedVoice("안냐세요");
		newCellPhone.bell();
		newCellPhone.sendVoice("반가버요");
		newCellPhone.turnOffWifi();
		newCellPhone.showPrice(5000000);
		System.out.println("가격: " + newCellPhone.price);
		newCellPhone.hangUp();

		
				

	}

}
