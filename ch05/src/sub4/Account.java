package sub4;

public class Account {
	protected String bank;
	protected String acc;
	protected String name;
	protected int balance;
	
	public Account(String bank, String acc, String name, int balance) {
		this.bank = bank;
		this.acc = acc;
		this.name = name;
		this.balance = balance;
	}
	
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getBank() {
		return bank;
	}
	
	
	public void deposit(int a) {
		this.balance += a;
	}
	
	public void withdraw(int b) {
		this.balance -= b;
	}
	
	public void show() {
		System.out.println("은행명 : " + this.bank);
		System.out.println("계좌번호 : " + this.acc);
		System.out.println("입금주 : " + this.name);
		System.out.println("현재잔액 : " + this.balance);
	}
	
}
