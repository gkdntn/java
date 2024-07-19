package sub2;

 /*
  *  날짜 : 2024/07/08
  *  이름 : 하정훈
  *  내용 : 캡슐화 실습하기
  */
public class EncapsTest {
	public static void main(String[] args) {
		
		
		// Car 객체 생성 --> 생성자 메서드를 통해서 선언과 동시에 바로 초기화
		Car sonata = new Car("소나타", "흰색", 0);
		
		// 초기화 --> 클래스의 멤버 변수를 private로 선언했기 때문에 초기화 되지않음
		//sonata.name = "소나타";
		//sonata.color = "흰색";
		//sonata.speed = 0;
		// --> 컴파일 오류 발생
		
		sonata.speedUp(80);
		sonata.speedDown(20);
		sonata.show();
		System.out.println("--------------------");
		
		Car avante = new Car("아반테", "검은색", 0);
		avante.setColor("빨간색");
		System.out.println("Getter 사용해서 출력해보기 : " + avante.getColor());
		avante.speedUp(100);
		avante.speedDown(40);
		avante.show();
		System.out.println("--------------------");
		// Account 객체 생성과 초기화 해보기

		Account kb = new Account("국민은행", "101-21-1001", "김유신", 10000);
		kb.deposit(30000);
		kb.withdraw(15000);
		kb.show();
		System.out.println("--------------------");
		
		Account wr = new Account("우리은행", "101-22-1001", "김춘추", 10000);
		wr.setBank("유리은행");
		wr.deposit(20000);
		wr.withdraw(15000);
		wr.show();
		System.out.println("--------------------");
		// 클래스 연습문제
		Book java = new Book("이것이 자바다", "신용권", "121-11-1001", 3);
		Book sql = new Book("혼자 공부하는 SQL", "우재남", "112-10-1102", 2);
		
		if (java.borrowBook()) {
			System.out.println("대출 성공");
		}else {
			System.out.println("대출 실패");
		}
		
		System.out.println("남은 도서 수 : " + java.getAvailableCopies());
		java.show();
		
	}// end of main
	
}// end of class
