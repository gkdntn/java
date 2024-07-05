package ch02.sec03;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : char 데이터타입에 유니코드를 대입해 문자 적어보기
 */
public class CharExample {
	 public static void main(String[] args) {
		
		 char c1 = 'A';
		 char c2 = 65;
		 char c3 = '가';
		 char c4 = 44032;
		 
		 // 유니코드를 통해 각 글자와 같은 글자를 대입해보았다
		 
		 System.out.println("c1 : " + c1);
		 System.out.println("c2 : " + c2);
		 System.out.println("c3 : " + c3);
		 System.out.println("c4 : " + c4);
		 
		 
	}
}
