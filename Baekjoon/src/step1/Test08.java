package step1;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int bYear = sc.nextInt();
		int year = bYear - 543;
		
		System.out.println(year);
		sc.close();
	}
}
