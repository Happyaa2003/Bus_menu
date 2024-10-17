import java.util.Scanner;
public class Passenger {
	
	private Name name;
	private int age;
	private Ticket ticket;
	private String gender;
	
	Scanner scan=new Scanner(System.in);
	
	public Passenger() {
		this.name=new Name();
		this.age=0;
		this.ticket=new Ticket();
		this.gender=null;
	}
	public Passenger(Name name,int age,Ticket ticket,String gender) {
		this.name=name;
		this.age=age;
		this.ticket=ticket;
		this.gender=gender;
	}
	public Passenger addNewPassenger() {
		name.addNewName();
		System.out.print("Age : ");
		age=scan.nextInt();
		
		System.out.println("T Num : ");
		int tnum=scan.nextInt();
		System.out.println("From/To      	To/From\n"+
				"Colombo		 Jaffna\n"+
				"Anuradapura	 Jaffna\n"+
				"Vavniya	 	 Jaffna\n"+
				"Anuradapura	 Colombo\n"+
				"Vavniya	 	 Colombo\n");
		System.out.print("Departure  : ");
		scan.nextLine();
		String depatch=scan.nextLine();
		System.out.print("Arraival  : ");
		
		String arraiv=scan.nextLine();
		
		System.out.println("Full or Half (f/h) :: ");
		char fh=scan.nextLine().charAt(0);
		
		if (fh=='f') {
			ticket=new Full_ticket(tnum,depatch,arraiv);
		//double price =ticket.getPrice();
		}
		else if (fh=='h') {
			ticket=new Half_ticket(tnum,depatch,arraiv);
		}
		else
			System.out.println("Wrong Letter Entered!.");
		
		System.out.println("Gender  : ");
		gender=scan.nextLine();
		return new Passenger(name,age,ticket,gender);
		
	}
	public String toString() {
		return "\nName : "+name.getNameWithIns()+"\nAge :"+age+
				"\nticket : "+ticket.toString()+"\ngender : "+gender;
	}
}
