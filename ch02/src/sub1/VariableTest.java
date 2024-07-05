package sub1;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : ch02. 변수와 연산자
 */
public class VariableTest {
	
	public static void main(String[] args) {
	
		// 변수
		int a = 1; // 변수의 선언과 초기화
		int b = 2;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		a = 3; // 변수의 재할당
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		
		// 상수
		
		final int num = 10; // 상수는 한번 선언하면 그 값이 변하지 않는다.
		
	
		System.out.println("num : " + num);
		
		
	}//end of main
}//end of class
