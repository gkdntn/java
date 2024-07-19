package step1;

import java.util.Scanner;

public class Test19 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			if ((b + c) >= 60) {
				a ++;
				b += c;
				b -= 60;
				for (int g = 0; g < 20; g++) {
				if (b >= 60) {
					a++;
					b -= 60;
				}
				if (a >= 24) {
					a -= 24;
				}
				if (b < 60) {
					break;
				}
				}
				
			} else if ((b + c) < 60) {
				b += c;
			} 
			System.out.println(a + " " + b);
			sc.close();
			
	}
}
