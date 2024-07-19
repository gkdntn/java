package test1;
/*
 * 날짜 : 2024/07/03
 * 이름 : 하정훈
 * 내용 : java 연습문제 7 풀어보기
 */
public class Test07 {
	public static void main(String[] args) {
	
		
		int total = 0;
		
		for (int k = 1; k <= 10; k++) {
			
			if(k % 2 == 0 || k % 3 == 0) {
				total += k;
				
			}
			
		}
	
		System.out.println("1 ~ 10까지 2와 3배수의 정수의 합 : " + total);
		
		
	}
}
