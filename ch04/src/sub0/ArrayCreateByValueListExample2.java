package sub0;

public class ArrayCreateByValueListExample2 {
	public static void main(String[] args) {
		
		
		int[] scores;
		scores = new int[] {83, 90, 87};
		
		int sum1 = 0;
		for (int i = 0; i < scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("배열의 총 합은 : " + sum1);
		
		
		printItem(new int[] {83, 90, 87});
		
		
	}
	// 메서드 정의하기
	public static void printItem(int[] a) {
		for(int i = 0; i<3; i++) {
			System.out.println("score[" + i + " ]: " + a[i]);
		}
	}
}
