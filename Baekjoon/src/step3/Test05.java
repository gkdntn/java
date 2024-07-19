package step3;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int a = 1; a < (n/4); a++) {
			if(n/4 > 1) {
				System.out.print("long ");
			}else {
				break;
			}
			
		}
		System.out.println("long int");
		sc.close();
	}
}
