package sub2;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : 자바 출력 실습하기
 */
public class PrintTest {
	
	public static void main(String[] args) {
		
		// 기본 출력
		System.out.println("Hello Java!");
		System.out.println("Hello Korea!");
		System.out.println("Hello Busan!");
		// 한줄 출력
		System.out.print("hi~");  // --> ln(줄바꿈) 처리가 안되었기 때문에 그 다음 출력문이 이어서 출력됨
		System.out.print("Hello~");
		
		// 개행 처리
		System.out.println();// 줄바꿈
		System.out.print("Welcome\n"); // \n으로도 줄바꿈(개행)처리 할 수 있다.
		System.out.print("Korea!");
		System.out.println("\nyahohohoho~");
		
		
	}// end of main
}// end of class
