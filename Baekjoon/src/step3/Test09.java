package step3;

import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a = 0; a < n; a++) {
			for(int c = n; c > a+1; c--) {
				System.out.print(" ");
			}
			
			for(int b = 0; b <= a; b++) {
				System.out.print("*");
			} System.out.println();
		} sc.close();
	}
}
