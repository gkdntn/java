package sub0;

public class Subway {
	private String number;
	private int fare;
	
	public Subway(String nember, int fare) {
		this.number = number;
		this.fare = fare;
	}
	
	public void ride(Student a) {
		if("부산고".equals(a.school)) {
			System.out.println("부산고등학교로 이동합니다.");
		}else {
			System.out.println("부경고등학교로 이동합니다.");
		}
		
		a.money -= fare;
		System.out.println("현재 잔액이 " + a.money + "원 남았습니다.");
	}
	
	
	
}
 