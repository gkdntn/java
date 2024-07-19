package sub3;
/*
 * 날짜 : 2024/07/15
 * 이름 : 하정훈
 * 내용 : Throw(예외 발생 시키기) 실습하기
 */

class Score {
	public void check(int score) throws Exception {
		
		if(score < 0) {
			// 예외 발생 시키기
			throw new  Exception("점수는 음수가 될 수 없습니다.");
		}else if(score > 100) {
			throw new Exception("점수는 100점을 넘길 수 없습니다.");
		}else {
			System.out.println("점수가 정상입니다.");
		}
		
	}

}





public class ThrowTest {

	public static void main(String[] args) {
		
		Score score = new Score();
		
		try { // 맨 처음 check에서 오류가 나면 아래에 있는 check는 생략된다.
			  // 때문에 모두 실행시키고 싶다면 try-catch문을 각각 사용해야 한다.
		score.check(-10);
		score.check(90);
		score.check(120);
		} catch(Exception e) {
			e.printStackTrace();
			
		}
		
		try {
			score.check(80);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			score.check(120);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("프로그램 정상 종료...");
	}

}
