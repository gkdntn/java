package test04;

public class Main04 {
	public static void main(String[] args) {
		
		Book book = new Book("이것이 자바다", "신용권", "101-1234-1001");

		Member member = new Member("홍길동", "A001");

		
		book.getBookInfo();
		System.out.println("--------------------");

		member.borrowBook(book);
		System.out.println("--------------------");

		book.getBookInfo();
		System.out.println("--------------------");

		member.getMemberInfo();
		System.out.println("--------------------");

		member.borrowBook(book);
		System.out.println("--------------------");

		member.returnBook(book);
		System.out.println("--------------------");

		member.getMemberInfo();
		System.out.println("--------------------");
		
	}
}
