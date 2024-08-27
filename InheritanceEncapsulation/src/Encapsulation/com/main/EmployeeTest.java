package Encapsulation.com.main;
import Encapsulation.com.example.demo.*;
public class EmployeeTest {
	public static void main(String [] args) {
         Engineer eng=new Engineer(101,"Jane Smith","012-34-5678",120_345.27);
         Manager m=new Manager(207,"Barbara Johnson","054-12-2367",109_501.36,"US Marketing");
         Admin a=new Admin(304,"Bill Munroe","108-23-6509",75_002.34);
         Director d=new Director(12,"Susan Wheeler","099-45-2340",120_567.36,"Global Marketing",1_000_000.00);
//         eng.printDetails();
//         m.printDetails();
//         a.printDetails();
//         d.printDetails();
         
         eng.raiseSalary(-5000);
         eng.setName("");
         eng.printDetails();
	}
		
}


