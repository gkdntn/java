package test04;

public class Book {
	protected String title;
	private String author;
	private String isbn;
	protected boolean isBorrowd;
	private String answer;
	
	public Book(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.isBorrowd = false;
		this.answer = "가능";
	}
	
	public void borrowBook() {
		if(isBorrowd == false) {
			isBorrowd = true;
			answer = "불가능";
			System.out.println("도서 대출 : " + title);
		}else {
			System.out.println(title + " 가 이미 대출되었습니다.");
			
		}
	}
	
	public void returnBook() {
		if(isBorrowd == true) {
			isBorrowd = false;
			answer = "가능";
			System.out.println("도서 반납 : " + title);
		}else {
			System.out.println(title + "이미 반납되었습니다.");
			
		}
	}
	
	public String getTitle() {
		return title;
	}
	
	public void getBookInfo() {
		System.out.println("제목 : " +this.title);
		System.out.println("저자 : " +this.author);
		System.out.println("ISBN : " +this.isbn);
		System.out.println("대출 여부 : " +this.answer);
	}
	
	
	
	
}
