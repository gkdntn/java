package ch02.sec05;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : boolean의 값을 이용하여 조건문을 시행하고 연산식의 결과를 boolean 변수의 값으로 저장해 출력해보기
 */
public class BooleanExample {
	public static void main(String[] args) {
		
		boolean stop = true;
		if(stop) {
			System.out.println("중지합니다.");
		} else {
			System.out.println("시작합니다.");
		}
		int x = 10;
		boolean result1 = (x ==20);
		boolean result2 = (x != 20);
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		
		
	}
}
