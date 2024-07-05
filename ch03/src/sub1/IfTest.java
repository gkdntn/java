package sub1;
/*
 * 날짜 : 2024/07/01
 * 이름 : 하정훈
 * 내용 : 조건문 if 실습
 */
public class IfTest {
	
	public static void main(String[] args) {
		
		
		// if 
		int num1 = 1;
		int num2 = 2;
		// 조건식이 참일 경우 수행문을 수행한다
		if( num1 < num2 ) {
			System.out.println("num1은 num2보다 작다.");
		}
		// 조건식이 거짓일 경우 수행하지 않는다. -> 오류 발생
		if (num1 >= 1) {
			System.out.println("num1은 1보다 크다.");
		}
		// 2중 if문도 사용할 수 있다. 조건식이 전부 참이여야 함.
		if (num1 > 0) {
			if (num2 > 1) {
				System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
			}
		}
		// 블럭 안에 코드가 중첩되면 헷갈릴 수 있으므로 한번에 정리할 수 있으면 정리하는 것이 좋다.
		if (num1 > 0 && num2 > 1) {
			System.out.println("num1은 0보다 크고 num2는 1보다 크다.");
		}
		
		// if ~ else
		int var1 = 1; int var2 = 2;
		
		if(var1 > var2) {
			System.out.println("var1이 var2보다 크다.");
			// 조건이 참일 경우의 수행문
		}else {
			System.out.println("var1이 var2보다 작다.");
			// 조건이 거짓일 경우의 수행문
		}
		
		
		// if ~ else if ~ else
		// 조건이 여러가지일 경우
		int n1 = 1, n2 = 2, n3 = 3, n4 = 4;
		
		if(n1 > n2) {
			System.out.println("n1이 n2보다 크다.");
			// 조건 1이 참일 경우의 수행문
		}else if(n2 > n3) {
			System.out.println("n2가 n3보다 크다.");
			// 조건 2가 참일 경우의 수행문
		}else if(n3 > n4) {
			System.out.println("n3이 n4보다 크다.");
			// 조건 3이 참일 경우의 수행문
		}else {
			System.out.println("n4가 가장 크다.");
			// 조건이 전부 거짓일 경우의 수행문
		}
		
		
	}// end of main
}// end of class
