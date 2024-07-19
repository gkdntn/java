package step3;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int a = 0; a < n; a++) {
			arr[a] = a;
		}
		
		int b = 0;
		for(int a : arr) {
			b += a;
		}
		System.out.println(b+n);
		sc.close();
		
	}
}
