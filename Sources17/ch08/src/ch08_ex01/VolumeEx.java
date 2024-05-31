package ch08_ex01;

public class VolumeEx {

	public static void main(String[] args) {
			Volume[] vol = new Volume[3];
			vol[0]		 = new TV();
			vol[1]		 = new Speaker();
			vol[2]		 = new Audio();
// TV, Speaker,Audio 3가지의 객체 존재한다			
			for (Volume v : vol) {
				v.volumeUp();
				v.volumeDown();
				if( v instanceof TV) {
					((TV)v).play();
				// TV일 때만 Play
				// 인스턴스를 비교하는 구문을 넣은 이유 확인
				}
			}
	}

}


