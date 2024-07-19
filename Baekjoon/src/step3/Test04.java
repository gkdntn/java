package step3;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		int arr[] = new int[n];
	
		for(int c = 0; c < n; c++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			arr[c] = a*b;
		}
		int e = 0;
		for(int d : arr) {
			e += d;
		}
		
		if(e == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		sc.close();
	}
}
