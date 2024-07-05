package ch02.sec01;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : 변수의 값을 교환해보기
 */
public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		 System.out.println("x : " + x + " y : " + y);
		 
		 int temp = x; // -> x의 값을 temp에 넣은 뒤 y의 값을 x로, temp의 값을 y로 넣어 x와 y의 값을 교환해보았다.
		 x = y;
		 y = temp;
		 System.out.println("x : " + x + " y : " + y);
		
		
	}//end of main
}//end of class
