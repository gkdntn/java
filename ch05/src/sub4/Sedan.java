package sub4;

public class Sedan extends Car{
	
	// Car클래스를 상속받기 때문에 Car에 있는 멤버 변수들은 선언할 필요가 없음.
	
	//private String name;
	//private String color;
	//private int speed;
	private int cc;
	
	
	public Sedan(String name, String color, int speed, int cc) {
		
		// 부모 클래스에 있는 변수들을 초기화시켜줘야 한다.
		// 초기화 방법은 super(멤버변수들);
		super(name, color, speed);
		this.cc = cc;
	}
	
	
	// Car클래스를 상속받기 때문에 Car에 있는 메서드들을 생성할 필요가 없음.
	
	// public void speedUp(int speed) {
	//	 this.speed += speed;
	// }
	// public void speedDown(int speed) {
	//	 this.speed -= speed;
	// }
	
	public void show() {
		super.show();
		System.out.println("배기량 : " + cc);
	}
	
	
	
}
