package step3;

import java.util.ArrayList;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Integer> abc = new ArrayList<Integer>();
		
		for(int c = 0; c >= 0; c++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			abc.add(a+b);
			if(a==b && a==0) {
				break;
			}
		}
		for(int d : abc) {
			if(d == 0) {
				break;
			}
			System.out.println(d);
		}
		
	}
}
