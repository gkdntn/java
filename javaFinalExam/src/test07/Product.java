package test07;

public class Product {
	private String prodId;
	private String prodName;
	private int price;
	private int quantity;
	
	public Product(String prodId, String prodName, int price, int quantity) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.price = price;
		this.quantity = quantity;
	}

	public void printProductInfo() {
		System.out.println("상품 아이디 : " + this.prodId);
		System.out.println("상품 이름 : " + this.prodName);
		System.out.println("상품 가격 : " + this.price);
		System.out.println("재고 수량 : " + this.quantity);
	}
}
