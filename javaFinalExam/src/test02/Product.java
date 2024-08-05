package test02;

public class Product {
	private String productId;
	private String productName;
	private int price;
	private int quantity;
	
	public Product(String productId, String productName, int price, int quantity) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.quantity = quantity;
	}
	
	public void updatePrice(int a) {
		this.price = a;
		System.out.println(productName + "가격 수정 됨");
	}
	
	public void addStock(int a) {
		this.quantity += a;
		System.out.println(productName + " " + a + "개 재고 추가 됨");
	}
	
	public void printProductInfo() {
		System.out.println("상품 ID : " + this.productId);
		System.out.println("상품 이름 : " + this.productName);
		System.out.println("가격 : " + this.price);
		System.out.println("재고 수량 : " + this.quantity);
	}
	
}
