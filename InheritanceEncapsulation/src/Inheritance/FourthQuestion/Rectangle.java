package Inheritance.FourthQuestion;

public class Rectangle {
double length;
double breadth;
Rectangle(double length,double breadth){
	this.length=length;
	this.breadth=breadth;
}

public void rArea() {
	System.out.println("Area="+this.length*this.breadth);
}
public void rPerimeter() {
	System.out.println("Perimeter of rectangel="+2*(this.length+this.breadth));
}
}
