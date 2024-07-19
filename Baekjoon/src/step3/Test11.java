package step3;

import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        StringBuilder input = new StringBuilder();
        System.out.println("여러 줄의 입력을 완료하려면 빈 줄을 입력하세요.");

        while (true) {
        
            String line = sc.nextLine();
            if (line.isEmpty()) {
                break;
            }
            input.append(line).append("\n");
        }
        String inputString = input.toString();
       // String[] line = inputString.split('\n');
        		
        System.out.println("입력된 내용:");
        System.out.println(input.toString());
		
	}
}
