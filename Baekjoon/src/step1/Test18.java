package step1;

import java.util.Scanner;

public class Test18 {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			int h = sc.nextInt();
			int m = sc.nextInt();
			
			if (m-45 < 0) {
				m += 60;
				h--;
				if (h < 0) {
					h += 24;
				} System.out.println(h + " " + (m-45));
			}else if (m - 45 >= 0) {
				System.out.println(h + " " + (m-45));
			}
				sc.close();
}
}
