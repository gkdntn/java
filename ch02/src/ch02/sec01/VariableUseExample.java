package ch02.sec01;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : 변수와 문자열의 결합출력 및 활용
 */
public class VariableUseExample {
	
	public static void main(String[] args) {
		
		int hour = 3;
		int minute = 5;
	System.out.println(hour + "시" + minute + "분");
	
		int totalMinute = (hour*60) + minute;
	System.out.println("총 " + totalMinute + "분");
	
}//end of main
}//end of class
