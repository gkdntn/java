package sub1;

// 제네릭 문법을 사용하기 위해 클래스 이름 뒤의 <>안에 변수타입 적어주기
public class FruitBox <T> {
	
	private T fruit;
	
	public T getFruit() {
		return fruit;
	}
	
	public void setFruit(T fruit) {
		this.fruit = fruit;
	}		
	
	
	
	
}
