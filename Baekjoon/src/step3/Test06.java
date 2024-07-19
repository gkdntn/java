package step3;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[t];
		
		for(int c = 0; c < t; c++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[c] += a+b;
		}
		int e = 0;
		for(int d : arr) {
			e++;
			System.out.printf("Case #%d: ",e);
			System.out.printf(d + "\n");
		}
		sc.close();
	}
}
