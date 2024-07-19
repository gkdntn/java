package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Testo4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[9];
		for(int a = 0; a < 9; a++) {
			arr[a] = sc.nextInt();
		}
		int d = arr[0];
		int e = 0;
		int g = 0;
	for(int b = 0; b < 9; b++) {
		e = Math.max(e, arr[b]);
			if(arr[b] > d) {
				d = arr[b];
				g = b;
			}
			}
	System.out.println(d);
	System.out.println(g + 1);
	}
}

