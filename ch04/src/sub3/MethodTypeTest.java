package sub3;
/*
 * 날짜 : 2024/07/02
 * 이름 : 하정훈
 * 내용 : java 메서드 타입 실습
 */
public class MethodTypeTest {

	public static void main(String[] args) {
		
		double a;
		a = type1(1.123);
		System.out.println(a);
		
		boolean b = true;
		type2(b);
		
		System.out.println(type3());
		
		}//end of main
	
	// 타입1 - 매개변수 O, 리턴값 O - 가장 정석적인 함수
	public static double type1(double x) {
		double y = (x * x) + Math.PI;
		return y;
	}
	// 타입2 - 매개변수 O, 리턴값 X
	public static void type2(boolean status) {
		
		if (status) {
			System.out.println("참입니다.");
		}else {
			System.out.println("거짓입니다.");
		}
	}
	// 타입3 - 매개변수 X, 리턴값 O
	public static boolean type3() {
		int num1 = 1;
		int num2 = 2;
		if(num1 > num2) {
			return true;
		}else {
			return false;
		}
		
	}
	// 타입4 - 매개변수 X, 리턴값 X
	public static void type4() {
	
		double result = type1(5.0);
		System.out.println("반지름의 길이가 5인 원의 넓이 : " + result);
			
	}	
	
	
	
	
}//end of class
