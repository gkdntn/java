package test05;

public class Student {
	private String name;
	private String studentId;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount;
	
	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		subjects = new Subject[10];
		scores = new int[10];
		subjectCount = 0;
	}
	public void enrollSubject(Subject a) {
		 subjects[subjectCount] = a;
		 a.addStudent(this);
		 subjectCount++;
		 System.out.println(name + " - " + a.getSubName() + " 과목 신청완료");
		 
	}
	
	public void setScore(Subject a, int b) {
		for (int i = 0; i <subjectCount; i++) {
			if (subjects[i].equals(a)) {
				scores[i] = b;
				 System.out.println(name + " - " + a.getSubName() + " 점수 입력완료");
			}
		}
	}
	
	public void printStudentInfo() {
		System.out.println("학생의 이름 : " + this.name);
		System.out.println("학생의 ID : " + this.studentId);
		System.out.println("성적");
		for (int i = 0; i < subjectCount; i++) {
			System.out.println(" - " + subjects[i].getSubName() + ": " +scores[i]);
		}
	}
	
	public String getName() {
		return name;
	}
	
}
