package ch08_ex03;

public class DmbCellPhone extends CellPhone {
	// 필드
	int channel;
	// 생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
 
	 void turnOnDmb() {
		System.out.println("채널 10번 DMB 방송 수신을 시작합니다.");
	}
	int changeChannelDmb(int channel) {
		System.out.println("채널 " + channel +"번으로 바꿉니다.");
		return channel;
	}
	void turnOffDmb() {
	System.out.println("Dmb 방송 수신을 멈춥니다.");
}
	//메소드
	//hw01
	//결과화면
	

}
