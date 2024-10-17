import java.util.Scanner;
public class Name {
	private String Fname,Mname,Lname;
	Scanner scan=new Scanner(System.in);
	
	public Name() {
		this.Fname=null;
		this.Mname=null;
		this.Lname=null;
	}
	public Name(String Fname,String Mname,String Lname) {
		this.Fname=Fname;
		this.Mname=Mname;
		this.Lname=Lname;
	}
//	public Name(Name N) {
//		this.Fname=N.Fname;
//		this.Mname=N.Mname;
//		this.Lname=N.Lname;
//	}
	public void addNewName() {
		System.out.print("FName : ");
		Fname=scan.nextLine();
		System.out.print("Mname : ");
		Mname=scan.nextLine();
		System.out.print("Lname : ");
		Lname=scan.nextLine();
	}
	public String getNameWithIns() {
		return Fname.charAt(0)+"."+Mname.charAt(0)+"."+Lname;
	}
}
