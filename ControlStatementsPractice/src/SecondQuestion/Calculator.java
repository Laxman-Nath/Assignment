package SecondQuestion;

import java.util.Scanner;

public class Calculator {
/*	Q2> WAP to calculate +,-,*,/ of two int values using switch.
	 *  
	 *    char op = sc.next().chatAt(0);
	 * 
 */
	
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		char op;
		System.out.println("Enter value of a:");
		a=sc.nextInt();
		System.out.println("Enter value of b:");
		b=sc.nextInt();
		System.out.println("Enter operator:");
		op=sc.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("The sum of "+a + " and "+b +" is :"+(a+b));
			break;
		case '-':
			System.out.println("The difference of "+a + " and "+b +" is :"+(a-b));
			break;
		case '*':
			System.out.println("The product of "+a + " and "+b +" is :"+(a*b));
			break;
		case '/':
			System.out.println("The division of "+a + " and "+b +" is :"+(a/b));
			break;
		default:
			System.out.println("Invalid operator!!");

		}
	}
	    
}
