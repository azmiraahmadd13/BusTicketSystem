package Controller;

import Model.BusTicket;
import Model.Passengers;

public class BusTicketSystem {
	private BusTicket busticket=new BusTicket();
	private Passengers passengers = new Passengers();
	
	
	
	public BusTicketSystem(){
		
	}
	
	public String bookTicket(String origin, String dest, String date, String seat) {
		String origin1 = busticket.getOrigin();
		String dest1 = busticket.getDest();
		String date1 = busticket.getDate();
		String seat1 = busticket.getSeat();
		return seat1;
		
		
	}
	

}
