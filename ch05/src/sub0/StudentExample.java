package sub0;

import sub3.Calc;

public class StudentExample {
	public static void main(String[] args) {
		Student a = new Student("철수", "부산고", "남자", 3, 90, 30000);
		Student b = new Student("유리", "부경고", "여자", 2, 75, 25000);
		Student c = new Student("짱구", "부산고", "남자", 1, 83, 40000);
		
		
		Subway metro = new Subway("1호선", 1600);
		
		a.hello(a, b);
		
		a.scoreGrade(a.getScore());
		b.scoreGrade(b.getScore());
		
		a.test(90);
		System.out.println(a.getScore());
		b.test(93);
		System.out.println(b.getScore());
		
		
		a.transfer(a, b);
		a.transfer(a, c);
		
		metro.ride(a);
		metro.ride(a);
		metro.ride(b);
		
	}
}
