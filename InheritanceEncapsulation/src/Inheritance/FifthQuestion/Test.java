package Inheritance.FifthQuestion;
import java.util.Scanner;

import Inheritance.FourthQuestion.*;
public class Test {
	public static void main(String [] args) {
		
	
   Square [] squares=new Square[10];
   Scanner sc=new Scanner(System.in);
   double side;
   for(int i=0;i<squares.length;i++) {
	   System.out.println("Enter length of one side of square "+(i+1));
	   side=sc.nextDouble();
	   squares[i]=new Square(side);
   }
   
   System.out.println("The area of squares are");
   for(int i=0;i<squares.length;i++) {
	   squares[i].sArea();
   }
	}
}
