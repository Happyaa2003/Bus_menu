import java.util.*;
public class Bus {
	private String Bnumber,date,location,time;
	private Seat seat;
	int i=0;
	private  ArrayList<Seat> seats=new ArrayList<>(50);
	private ArrayList<String> Sheets=new ArrayList<>(50);
	
	Scanner scan=new Scanner(System.in);
	
	public Bus() {
		this.Bnumber=null;
		this.date=null;
		this.location=null;
		this.time=null;
		this.seat=new Seat();
	}

	
	public void bookNewSeat() {
		System.out.print("Bnumber : ");
		Bnumber=scan.nextLine();
		System.out.print("date : ");
		date=scan.nextLine();
		System.out.print("location : ");
		location=scan.nextLine();
		System.out.print("time : ");
		time=scan.nextLine();
		System.out.print("Seat Number :");
		int Snum=scan.nextInt();
		seat=new Seat(Snum,seat.getPassenger());
		
		if(i<50) {
			seats.add(seat);
			System.out.println("Booking Complete");
			i++;
		}else {
			System.out.println("All booked.Sorry");
		}
		
	}
	public void saveSummSheet() {
		Sheets.add(toString());
	}
	
	public void printSummerySheet() {
		System.out.println(toString());
	}
	
	public void printAvailability() {
		if(i<50) {
			System.out.println("Available Seat Count "+(50-i));
		}else {
			System.out.println("All booked.No Any Seat.Sorry");
		}
	}
	public String toString() {
		return "Bnumber : "+Bnumber+"\ndate : "+date+
				"\nlocation : "+location+"\ntime : "+time+seat.toString();
				
	}
}
