package step3;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a = 0; a < n; a++) {
			for(int b = 0; b <= a; b++) {
				System.out.print("*");
			} System.out.println();
		}
		sc.close();
	}
}
