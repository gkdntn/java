package step4;

import java.util.Scanner;

public class Testo6 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        boolean[] students = new boolean[31]; // 학생 번호에 대응하는 배열, 인덱스 0은 사용 안 함
	        for (int i = 0; i < 28; i++) {
	            int num = sc.nextInt();
	            students[num] = true; // 과제 제출한 학생 표시
	        }

	        for (int i = 1; i <= 30; i++) {
	            if (!students[i]) { // 과제 미제출 학생 번호 출력
	                System.out.println(i);
	            }
	        }
	        

	        sc.close();
	}
}
