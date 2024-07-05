package ch02.sec06;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : String 타입과 이스케이프 문자를 사용해보기
 */
public class StringExample {
	public static void main(String[] args) {
		
		String name = "홍길동";
		String job = "프로그래머";
		System.out.println(name);
		System.out.println(job);
		
		String str = "나는 \"자바\"를 배웁니다."; // \" -> "문자 포합
		System.out.println(str);
		
		str = "번호\t이름\t직업"; // /t -> 출력시 탭만큼 간격 띄우기
		System.out.println(str);
		
		System.out.print("나는\n");  // \n -> 줄바꿈 
		System.out.print("자바를\n");
		System.out.print("배웁니다.");
		
		
		
		
		
		
		
		
		
		
	}
}
