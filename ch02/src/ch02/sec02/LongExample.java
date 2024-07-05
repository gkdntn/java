package ch02.sec02;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : long 타입의 타입값 표시 안함으로 인한 컴파일오류 예시
 */
public class LongExample {
	public static void main(String[] args) {
		
		long var1 = 10;
		// --> 뒤에 long 타입의 타입값 L을 표시하지 않았으나 한단계 아래의 정수 타입인 int 타입으로 자동 형 변환을 했기에 오류가 나지 않는 모습이다.
		long var2 = 20L;
		long var3 = 999999999999L;
	//	long var4 = 999999999999;
		// --> 뒤에 long 타입의 타입값 L을 표시하지 않아 컴파일 오류가 난 모습이다.
		// var4의 값이 int 타입의 범위를 넘어갔기 때문에 자동 형 변환을 해도 오류가 난다.
		 
		
	}
}
