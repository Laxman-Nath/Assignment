package FirstQuestion;

import java.util.Scanner;

public class SalaryCalculator {
/*	 Q1>  WAP to calculate total salary of following post :
		 *   
		 *      post         basic salary      bonus   total salary 
		 *    ---------     --------------    -------  --------------
		 *    MD                 230000         20%         ?
		 *    CEO                250000         25.79%      ?
		 *    MANAGER            176000         16 %        ?
		 *    HELPER             145900         9%          ?   
		 *    
		 *  --------------------------------------------------- */
	
public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	String post;
	System.out.println("Enter your post");
	post=sc.next();
	if(post.equals("MD")) {
		System.out.println("Your total salary is:"+(230000+(230000*20)/100));
	}
	else if(post.equals("CEO")) {
		System.out.println("Your total salary is:"+(250000+(250000*25.79)/100));
	}
	else if(post.equals("MANAGER")) {
		System.out.println("Your total salary is:"+(176000+(176000*16)/100));
	}
	else if(post.equals("HELPER")) {
		System.out.println("Your total salary is:"+(145900+(145900*9)/100));
	}
	else {
		System.out.println("Your Post is invalid");
	}
}
}
