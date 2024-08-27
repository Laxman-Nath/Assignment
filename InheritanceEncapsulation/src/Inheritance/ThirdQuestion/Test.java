package Inheritance.ThirdQuestion;

public class Test {
public static void main(String[] args) {
	Employee e1=new Employee();
	e1.name="Laxman";
	e1.age=23;
	e1.address="Daijee";
	e1.phoneNumber=9876543210l;
	e1.salary=23908;
	System.out.println(e1.name);
	System.out.println(e1.age);
	System.out.println(e1.address);
	System.out.println(e1.phoneNumber);
	e1.prinSalary();
	
	Manager m1=new Manager();
	m1.name="bikash";
	m1.age=25;
	m1.address="Dhangadi";
	m1.phoneNumber=9876543210l;
	m1.salary=245908;
	System.out.println(m1.name);
	System.out.println(m1.age);
	System.out.println(m1.address);
	System.out.println(m1.phoneNumber);
	m1.prinSalary();
	
	
	
}
}
