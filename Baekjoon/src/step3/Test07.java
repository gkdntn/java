package step3;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = new int[t];
		int arr1[] = new int[t];
		int arr2[] = new int[t];
		int a;
		int b;
		
		for(int c = 0; c < t; c++) {
			a = sc.nextInt();
			b = sc.nextInt();
			arr[c] += a+b;
			arr1[c] = a;
			arr2[c] = b;
		}
		
		for(int d = 0; d < t; d++) {
			
			System.out.printf("Case #%d: %d + %d = %d",d+1, arr1[d], arr2[d], arr[d]);
			System.out.println();
		}
			sc.close();
	}
}
