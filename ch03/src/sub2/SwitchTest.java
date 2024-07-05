package sub2;

import java.util.Scanner;

/*
 * 날짜 : 2024/07/01
 * 이름 : 하정훈
 * 내용 : 조건문 switch 실습
 */
public class SwitchTest {

	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		// 콘솔 입력
		// 콘솔창에 입력을 할 수 있게 해주는 코드. 
		// 자주 사용하니 꼭 기억할 것.***
		Scanner sc = new Scanner(System.in);
		// int number에 콘솔창에 입력한 숫자를 바로 대입하는 것.
		int number = sc.nextInt();
		
		System.out.println("입력한 숫자 : " + number);
		// switch 문은 조건식이 들어가는 것이 아니고 값이 바로 들어간다.
		switch(number % 2) {
			
			case 0:
				System.out.println("number는 짝수");
				break;
			case 1:
				System.out.println("number는 홀수");
				break;
				
		}
		
		
		
	}// end of main
}// end of class
