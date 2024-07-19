package step4;

import java.util.Scanner;

public class Testo7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		int e = 0;
		for (int a = 0; a < arr.length; a++) {
			arr[a] = sc.nextInt();
		}
		
		for ( int b = 0; b < arr.length; b++) {
			arr[b] = arr[b] % 42;
		}
		
		for(int c = 0; c < arr.length; c++) {
				if(arr[c]%42 == arr[c++]%42) {
					e++;
				
			}
		}
		System.out.println(e);
	}
}
