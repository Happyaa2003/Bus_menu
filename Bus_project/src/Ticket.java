
public class Ticket {
	private int Tnum;
	private String departure,arrival;
	
	public Ticket() {
		this.Tnum=0;
		this.departure=null;
		this.arrival=null;
	}
	public Ticket(int Tnum,String departure,String arrival) {
		this.Tnum=Tnum;
		this.departure=departure;
		this.arrival=arrival;
	}
	public String getdeparture() {
		return departure;
	}
	public String getarrival() {
		return arrival;
	}
	public String toString() {
		return "Tnum : "+Tnum+"\ndeparture : "+departure
				+"\narrival : "+arrival;
	}
	
}
