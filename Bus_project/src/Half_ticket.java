import java.util.Scanner;

public class Half_ticket extends Ticket {
	Scanner scan=new Scanner(System.in);
	
	public Half_ticket() {
		super();
		
	}
	public Half_ticket(int number,String departure,String arrival) {
		super(number,departure,arrival);
	}
	public String toString() {
		return super.toString()+"\nPrice : "+getPrice();
	}
	
	public double getPrice() {
		System.out.println("        Half Ticket \n\n");
		
		double price=0.00;
	
		String departure=super.getdeparture();
		
		String arrival=super.getarrival();
		
		int op=0;
		if((departure=="Colombo")&&(arrival=="Jaffna"))
			op=1;
		else if((departure=="Anuradapura")&&(arrival=="Jaffna"))
			op=2;
		else if((departure=="Vavniya")&&(arrival=="Jaffna"))
			op=3;
		else if((departure=="Anuradapura")&&(arrival=="Colombo"))
			op=4;
		else if((departure=="Vavniya")&&(arrival=="Colombo"))
			op=5;
		else
			System.out.println("Wrong Location Entered!.");
		
		switch(op) {
		case 1:price=500.00;break;
		case 2:price=350.00;break;
		case 3:price=200.00;break;
		case 4:price=200.00;break;
		case 5:price=350.00;break;
		default:
			System.out.println("Error.Wrong Option Enterred !!!.");
		}
		return price;
	}
}
