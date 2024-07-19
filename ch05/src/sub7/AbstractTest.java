package sub7;
/*
 * 날짜 : 2024/07/10
 * 이름 : 하정훈
 * 내용 : 추상 클래스 실습하기
 */
public class AbstractTest {
	
	public static void main(String[] args) {
		
		// 추상클래스는 구현을 못하기 때문에 추상 클래스로 객체를 생성할 수 없다.
		// Animal animal = new Animal(); --> X
		
		Animal tiger = new Tiger();
		Animal eagle = new Eagle();
		Animal shark = new Shark();

		tiger.move();
		tiger.hunt();
		
		eagle.move();
		eagle.hunt();
		
		shark.move();
		shark.hunt();
	
	}
}

