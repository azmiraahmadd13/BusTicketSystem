package Model;

public class BusTicket {
	private String origin;
	private String dest;
	private String date;
	private String seat;
	private double price;
	private double total;
	
	public BusTicket() {
		
	}
	
	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin=origin;
	}
	
	public String getDest() {
		return dest;
	}

	public void setDest(String dest) {
		this.dest=dest;
	}
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date=date;
	}
	public double getPrice() {
		return price;
	}

	public void setSeat(double price) {
		this.price=price;
	}
	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total=total;
	}
	
	void chooseSeats(){
		
	char[][] seats = new char[15][6];

	for (int i =0; i<seats.length; i++) {
		for (int j = 0; j<seats[i].length; j++) {
			seats[i][j] ='o';
		}
	}

	for (int i =0; i<seats.length; i++) {
			for (int j = 0; j<seats[i].length; j++) {
				System.out.print(seats[i][j]+ " " );
				}
				System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();

		seats[3][4]= 'x';

		for (int i =0; i<seats.length; i++) {
			for (int j = 0; j<seats[i].length; j++) {
				System.out.print(seats[i][j]+ " " );
				}
				System.out.println();// move to next line
		}
}
}
