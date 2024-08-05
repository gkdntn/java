package user5;

import java.util.Scanner;

public class User5Main {
	public static void main(String[] args) {
		System.out.println("-------------------------------");
		System.out.println("회원 관리 매니저 v1.0");
		System.out.println("-------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				System.out.print("번호 입력 : ");
				int seq = sc.nextInt();
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				System.out.print("성별 입력 : ");
				String gender = sc.next();
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				System.out.print("주소 입력 : ");
				String addr = sc.next();
				
				User5VO vo = new User5VO(seq, name, gender, age, addr);
				User5DAO dao = User5DAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("입력완료...");
				
			}else if(answer == 2) {
				
			}else if(answer == 3) {
				
			}else if(answer == 4) {
				
			}else if(answer == 5) {
				
			}
		}
		
		System.out.println("프로그램을 종료합니다...");
	}
}
