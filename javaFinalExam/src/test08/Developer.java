package test08;

public class Developer extends Employee{
	private String field;

	public Developer(String name, String birth, String employeeId, String dept, int salary, String field) {
		super(name, birth, employeeId, dept, salary);
		this.field = field;
	}
	
	public void changeField(String a) {
		this.field = a;
	}
	
	public void printDeveloperInfo() {
		super.printEmployeeInfo();
		System.out.println("개발 분야 : " + this.field);
	}
	
}
