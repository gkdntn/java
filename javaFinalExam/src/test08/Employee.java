package test08;

public class Employee extends Person{

	private String employeeId;
	private String dept;
	private int salary;
	
	public Employee(String name, String birth, String employeeId, String dept, int salary) {
		super(name, birth);
		this.employeeId = employeeId;
		this.dept = dept;
		this.salary = salary;
	}

	public void raiseSalary(int a) {
		this.salary += a;
	}
	
	public void changeDept(String a) {
		this.dept = a;
	}
	
	public void printEmployeeInfo() {
		super.printPersonInfo();
		System.out.println("직원 아이디 : " + this.employeeId);
		System.out.println("부서 : " + this.dept);
		System.out.println("급여 : " + this.salary);
	}
	
}
