package test03;

public class MovieTicket {
	private String movieTitle;
	private String screenTime;
	private String seatNumber;
	private boolean isBooked;
	
	
	public MovieTicket(String movieTitle, String screenTime, String seatNumber) {
		this.movieTitle = movieTitle;
		this.screenTime = screenTime;
		this.seatNumber = seatNumber;
		this.isBooked = false;
	}
	
	public void bookTicket() {
		if (isBooked == false) {
			isBooked = true;
			System.out.println("예약이 완료되었습니다.");
		}else {
			System.out.println("티켓이 이미 예약되어 있습니다.");
		}
	}
	
	public void cancelBook() {
		if (isBooked == true) {
			isBooked = false;
			System.out.println("예약취소가 완료되었습니다.");
		}else {
			System.out.println("티켓이 예약되어 있지 않습니다.");
		}
	}
	
	public void printTicketInfo() {
		System.out.println("영화 제목 : " + movieTitle);
		System.out.println("상영 시간 : " + screenTime);
		System.out.println("좌석 번호 : " + seatNumber);
		System.out.println("예약 여부 : " + (isBooked ? "yes" : "no"));
	}
}
