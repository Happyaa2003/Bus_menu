import java.util.Scanner;

public class Full_ticket extends Ticket{
Scanner scan=new Scanner(System.in);
	
	public Full_ticket() {
		super();
		
	}
	public Full_ticket(int number,String departure,String arrival) {
		super(number,departure,arrival);
	}
	
	public String toString() {
		return super.toString()+"\nPrice : "+getPrice();
	}
	
	public double getPrice() {
		System.out.println("        Full Ticket \n\n");
		double price=10.00;
		
		String departure=super.getdeparture();
		
		String arrival=super.getarrival();
		
		int op=0;
		if((departure.trim()=="Colombo")&&(arrival.trim()=="Jaffna"))
			op=1;
		else if((departure.trim()=="Anuradapura")&&(arrival.trim()=="Jaffna"))
			op=2;
		else if((departure.trim()=="Vavniya")&&(arrival.trim()=="Jaffna"))
			op=3;
		else if((departure.trim()=="Anuradapura")&&(arrival.trim()=="Colombo"))
			op=4;
		else if((departure.trim()=="Vavniya")&&(arrival.trim()=="Colombo"))
			op=5;
		else
			System.out.println("Wrong Location Entered!.");
		
		switch(op) {
		case 1:price=500.00*2;break;
		case 2:price=(350.00*2)*(5/4);break;
		case 3:price=(200.00*2)*(5/4);break;
		case 4:price=(200.00*2)*(5/4);break;
		case 5:price=(350.00*2)*(5/4);break;
		default:
			System.out.println("Error.Wrong Option Enterred !!!.");
		}
		return price;
	}
}
