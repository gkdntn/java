package step4;

import java.util.Scanner;

public class Testo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[] = new int[n];
		
		for(int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		for(int b = 0; b < arr.length; b++) {
			if(arr[b] < x) {
				System.out.print(arr[b]+ " ");
			}
		}
		sc.close();
	}
}
