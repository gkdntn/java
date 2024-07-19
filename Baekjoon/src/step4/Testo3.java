package step4;

import java.util.Arrays;
import java.util.Scanner;

public class Testo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int a = 0; a < n; a++) {
			arr[a] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.println(arr[0] + " " + arr[arr.length - 1]);
		}
	}

