package test04;

public class Member {
	private String name;
	private String memberId;
	private Book borrowedBook;
	
	public Member(String name, String memberId) {
		this.name = name;
		this.memberId = memberId;
		this.borrowedBook = null;
	}
	
	public void borrowBook(Book a) {
		borrowedBook = a;
		a.borrowBook();
	}
	
	public void returnBook(Book a) {
		a.returnBook();
		borrowedBook = null;
	}
	
	
	public void getMemberInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("회원 ID : " + this.memberId);
		if(borrowedBook != null) {
			System.out.println("대출한 도서 : " + borrowedBook.getTitle());
		}else {
			System.out.println("대출한 도서 : 없음" );
		}
		
	}
	
}
