package ex1;

public class IfElseIfElseExample {

	public static void main(String[] args) {
		
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 100-90입니다.");
			System.out.println("등급은 A등급입니다.");
		} else if(score >= 80) {
			System.out.println("점수가 90-80입니다.");
			System.out.println("등급은 B등급입니다.");
		} else if(score >= 70) {
			System.out.println("점수가 80-70입니다.");
			System.out.println("등급은 C등급입니다.");
		} else {
			System.out.println("점수가 70점 미만입니다.");
			System.out.println("등급은 D등급입니다.");
		}
	}
}
