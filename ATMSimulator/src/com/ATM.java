package com;

import java.util.Scanner;

public class ATM {
	static int accountBalance=200000;
	static int originalPin=6764;
	static int destinationAccno=3421;
	static int destinationAccountBalance=5000;
	public static boolean authenticateUser() {
		Scanner sc=new Scanner(System.in);
		int enteredPin;
		
		System.out.println("Enter 4-digit pin");
		enteredPin=sc.nextInt();
		if(enteredPin == originalPin) {
			return true;
		}
		else {
				System.out.println("You entered wrong Pin.Enter pin again!!");
				enteredPin=sc.nextInt();
				if(enteredPin == originalPin) {
					return true;
					
				}
				else {
						System.out.println("You entered wrong Pin.Enter pin again!!");
						enteredPin=sc.nextInt();
						if(enteredPin == originalPin) {
							return true;
		
						}
						else {
							return false;
						}
				}
			}
}

	public static void enquiry() {
		int choice;
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("Your balance is:"+accountBalance);
			System.out.println("Do you want to print the receipt?");
			System.out.println("1 .Yes");
			System.out.println("2 .No");
			choice=sc.nextInt();
			if(choice == 1) {
				System.out.println("printing receipt");
				System.out.println("Thank you for choosing us!");
			}
			else {
				System.out.println("Thank you!");
			}
			
		}
	
	
	
public static void cashWithDraw(float amount) {
   
	   if(accountBalance>=amount) {
		   accountBalance-=amount;
		   System.out.println("Sucessfully withdrawl "+amount +" from your account");
		   enquiry();
			System.out.println("Thank you!");
	   }
	   else {
		   System.out.println("Insufficient Balance");
	   }
   
	  
   
}

public static void transfer(int accno,float amount) {
	if(accno != destinationAccno) {
		System.out.println("Invalid account number");
		return;
	}
	else
	{
		if(accountBalance>=amount) {
			accountBalance-=amount;
			destinationAccountBalance+=amount;
			System.out.println("Sucessfully transferred "+amount+" to account number "+accno);
			enquiry();
			System.out.println("Thank you");
		}
		else {
			System.out.println("insufficient amount");
		}
	}
}
	
public static void main(String [] args) {
   int choice;
   float amount;
   int accno;
   float transferAmount;
   Scanner sc=new Scanner(System.in);
	 do{
		 System.out.println("1.Enquiry balance");
		 System.out.println("2.Withdraw balance");
		 System.out.println("3.Transfer money");
		 System.out.println("4.Exit");
		System.out.println("Enter your choice");
		choice=sc.nextInt();
		
		switch(choice) {
		case 1:
			if(authenticateUser()) {
			enquiry();
			}
			else {
				System.out.println("Session expired!");
				 System.out.println("Thank you for using our system");
				return;
			}
			break;
		case 2:
			if(authenticateUser()) {
				System.out.println("Enter amount to withdraw");
				amount=sc.nextFloat();
				cashWithDraw(amount);
				}
				else {
					System.out.println("Session expired!");
					
					return;
				}
			break;
		case 3:
			if(authenticateUser()) {
				System.out.println("Enter destination account number");
				accno=sc.nextInt();
				System.out.println("Enter amount to be tranferred");
				transferAmount=sc.nextFloat();
				transfer(accno,transferAmount);
				}
				else {
					System.out.println("Session expired!");
					return;
				}
			break;
		default: 
			if(choice != 4) {
			      System.out.println("Invalid choice");
			}
		}
		
	}while(choice != 4);
	 
	 System.out.println("Thank you for using our system");
}
}
