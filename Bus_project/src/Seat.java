
public class Seat {
	private int Snum;
	private Passenger passenger;
	private boolean Booked;
	
	public Seat() {
		this.Snum=0;
		this.passenger=new Passenger();
	}
	public Seat(int Snum,Passenger passenger) {
		this.Snum=Snum;
		this.passenger=passenger.addNewPassenger();;
	}
	
	
	public Passenger getPassenger() {
		return passenger;
	}
	//public void setBook(boolean)
	public String toString() {
		return "Snum : "+Snum+"\nPassenger : "+passenger.toString();
	}
}
