package ch02.sec02;
/*
 * 날짜 : 2024/06/28
 * 이름 : 하정훈
 * 내용 : byte 타입 변수에 범위 초과로 인한 컴파일 오류
 */
public class ByteExample {
	public static void main(String[] args) {
		
		byte var1 = -128;
		byte var2 = -30;
		byte var3 = 0;
		byte var4 = 30;
		byte var5 = 127;
	//	byte var6 = 128; // byte 타입은 -128~127의 범위를 가지고 있기 때문에 127을 넘어간 순간 컴파일 오류가 발생한다.
		
			
		
		
	}
}
