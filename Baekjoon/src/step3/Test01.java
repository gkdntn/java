package step3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		
		for (int b = 1; b < 10; b++) {
			System.out.println(a + " * " + b + " = " + a*b);
		}
		sc.close();
	}
}
