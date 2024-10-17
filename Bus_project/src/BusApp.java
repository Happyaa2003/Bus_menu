import java.util.*;
//mihi
public class BusApp {
	

//private static ArrayList<Bus> buses=new ArrayList<>(50);
	
	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
		 Bus bus=new Bus();
		while(true) {
			System.out.println("########################################\n"+
							   "#             BUS MENU                 #\n"+
							   "########################################\n"+
							   "    [1].Book a New Seat \n"+
							   "    [2].Print Summary Sheet\n"+
							   "    [3].Save Summary Sheet\n"+
							   "    [4].Print Availability\n"+
							   "    [5].Exit\n"+
							   "########################################\n"
							);
			System.out.print("Input Option : ");
			int op=scan.nextInt();
			
			switch(op) {
				case 1:
					bus.bookNewSeat();
					break;
				case 2:
					bus.printSummerySheet();
					break;
				case 3:
					bus.saveSummSheet();
					break;
				case 4:
					bus.printAvailability();
					break;
				case 5:
					System.exit(0);;break;
				default:
						System.out.println("Wrong Option Entered!!!.");
						break;
						}
		}

	}

}
