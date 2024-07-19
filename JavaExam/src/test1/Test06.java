package test1;

import java.util.Scanner;

/*
 * 날짜 : 2024/07/03
 * 이름 : 하정훈
 * 내용 : java 연습문제 6 풀어보기
 */
public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("x값 입력 : ");
		int x = sc.nextInt();
		
		
		System.out.println("y값 입력 : ");
		int y = sc.nextInt();
		
		String result = x > y ? "x가 더 틉니다." : "y가 더 크거나 같습니다.";
		
		System.out.println(result);
	
		sc.close();
	}
}
