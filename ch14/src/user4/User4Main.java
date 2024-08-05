package user4;

import java.util.Scanner;

public class User4Main {
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
				System.out.print("아이디 입력 : ");
				String uid = sc.next();
				
				System.out.print("이름 입력 : ");
				String name = sc.next();
				
				System.out.print("성별 입력 : ");
				String gender = sc.next();
				
				System.out.print("나이 입력 : ");
				int age = sc.nextInt();
				
				System.out.print("휴대폰 입력 : ");
				String hp = sc.next();
				
				System.out.print("주소 입력 : ");
				String addr = sc.next();
				
				User4VO vo = new User4VO(uid, name, gender, age, hp, addr);
				User4DAO dao = User4DAO.getInstance();
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
