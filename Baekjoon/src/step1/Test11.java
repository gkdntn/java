package step1;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long c = sc.nextLong();
		
		long d = a + b + c;
		
		System.out.println(d);
		sc.close();
		
	}
}