package test01;

public class StudentScore {
	private String studentName;
	private String studentId;
	private String subject;
	private double score;
	
	public StudentScore(String studentName, String studentId, String subject, double score) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	
	public void updateScore(double a) {
		
		if(a < 0 || a > 100) {
			System.out.println("잘못된 점수 입력");
			
		}else {
			System.out.println("점수 수정 완료");
			this.score = a;
		}
	}
	
	public double getScore() {
		return score;
	}
	
	public void printStudentInfo() {
		System.out.println("이름 : " + this.studentName);
		System.out.println("ID : " + this.studentId);
		System.out.println("과목명 : " + this.subject);
		System.out.println("점수 : " + this.score);
	}
}
