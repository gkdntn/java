package step4;

import java.util.Scanner;

public class Testo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int g = 0;
		int arr[] = new int[t];
		
		for(int a = 0; a < t; a++) {
			arr[a] = sc.nextInt();
		}
		int c = sc.nextInt();
		
		for(int d = 0; d < t; d++) {
			
			if(arr[d] == c) {
				g++;
			}
		}
		System.out.println(g);
		sc.close();
	}
}
