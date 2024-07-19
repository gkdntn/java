package sub0;

public class Student {

	private String name;
	protected String school;
	private String gender;
	private int grade;
	private int score;
	protected int money;
	
	public Student(String name, String school, String gender, int grade, int score, int money) {
		this.name = name;
		this.school = school;
		this.gender = gender;
		this.grade = grade;
		this.score = score;
		this.money = money;
	}
	
	public int getScore() {
		return score;
	}
	
	public void hello(Student a, Student b) {
		System.out.println(a.name + "가 " + b.name + "에게 인사합니다");
	}
	
	public void scoreGrade(int score) {
		if(this.score >= 90) {
			System.out.println("A학점 입니다.");
		}else if (this.score >= 80) {
			System.out.println("B학점 입니다.");
		}else if (this.score >= 70) {
			System.out.println("C학점 입니다.");
		}else {
			System.out.println("낙제점입니다.");
		}
	}
	
	public void test(int score) {
		if(score > this.score) {
			System.out.println("점수가 " + (score - this.score) + "점 만큼 올랐습니다.");
			this.score = score;
		}else if (score == this.score) {
			System.out.println("점수가 동일합니다.");
		}else {
			System.out.println("점수가 " + (this.score - score) + "점 만큼 떨어졌습니다.");
			this.score = score;
		}
	}
	
	public void transfer(Student a, Student b) {
		a.school = b.school;
		System.out.println(a.name + "가 " + b.school + "로 전학갑니다.");
	}
	
	 /*
	   *  궁금한 점
	   *  
	   */
	
}
