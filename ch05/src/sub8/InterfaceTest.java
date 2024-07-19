package sub8;
/*
 * 날짜 : 2024/07/11
 * 이름 : 하정훈
 * 내용 : 인터페이스 실습하기
 * 
 *  인터페이스 : 표준화된 클래스 설계에 사용되는 구조체 
 *	--> 같은 프로젝트를 하는 개발자들이 서로 다른 메서드를 만들지 않도록 기준 역할을 함
 *	--> 오직 추상 메서드만 선언 가능하다
 *	--> 인터페이스를 활용해서 다형성을 구현하고 객체간 결합도를 완화시킬 수 있다
 *	--> 다중상속 효과를 낼 수 있다 (상속과 구현을 섞어서 사용)
 */

class Computer {
	public void boot() {
		System.out.println("부팅...");
	}
}

interface Internet {
	public void access();
}

class Tv extends Computer implements Internet{
	
	public void show() {
		System.out.println("TV 시청...");
	}
	
	@Override
	public void access() {
		System.out.println("인터넷 접속...");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		
		// 인터페이스 실습1 - 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG();
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.powerOff();
		
		System.out.println();
		
		RemoteControl samsung = new RemoteSamsung();
		samsung.powerOn();
		samsung.chDown();
		samsung.soundDown();
		samsung.powerOff();
		
		System.out.println();
		
		// 인터페이스 실습2 - 다형성 예제
		Bulb bulb = new Bulb();
		Socket socket = new Cable(bulb);
		
		socket.switchOn();
		socket.switchOff();
		
		System.out.println();
		
		// 인터페이스 실습3 - 다중 상속 효과 예제
		// -> 한번의 상속과 한번의 구현으로 다중 상속의 효과를 만들어 낼 수 있다.
		Tv tv = new Tv();
		tv.boot();
		tv.access();
		tv.show();
		
	}

}
