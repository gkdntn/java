package test02;

public class Main02 {
	public static void main(String[] args) {
		Product product = new Product("P001", "키보드", 35000, 10);
		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("--------------------");
		// 가격 수정 및 재고 관리 테스트
		product.updatePrice(30000);
		System.out.println("--------------------");
		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("--------------------");
		// 재고 추가
		product.addStock(5);
		
		System.out.println("--------------------");
		// 상품 정보 출력
		product.printProductInfo();
		System.out.println("--------------------");
	}
}
