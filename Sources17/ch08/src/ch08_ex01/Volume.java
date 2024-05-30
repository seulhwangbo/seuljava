package ch08_ex01;
// hw02
// 인터페이스 과제
public interface Volume {
	void volumeUp();
	void volumeDown();

}

class TV implements Volume{

	@Override
	public void volumeUp() {
		System.out.println("TV Volume 올리기");
	}

	@Override
	public void volumeDown() {
		System.out.println("TV Volume 내리기");
	}
	
	public void play() {
		System.out.println("TV 화면을 본다.");
	}
	
}
class Audio implements Volume{

	@Override
	public void volumeUp() {
		System.out.println("Audio Volume 올리기");
		
		
	}

	@Override
	public void volumeDown() {
		System.out.println("Audio Volume 내리기");
		// TODO Auto-generated method stub
		
	}
	
}
class Speaker implements Volume{

	@Override
	public void volumeUp() {
		System.out.println("Speaker Volume 올리기");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
		System.out.println("Speaker Volume 내리기");
		
	} 
	
}

// 상속을 통해 소리의 높낮이를 조절할 수 있게 해야 한다.
