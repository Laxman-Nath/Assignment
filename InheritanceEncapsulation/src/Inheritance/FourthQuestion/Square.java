package Inheritance.FourthQuestion;

public class Square extends Rectangle {
	public double side;

	public Square(double side) {
		super(side, side);
		this.side = side;
		
	}

	public void sArea() {
		System.out.println("Area of square is:" + this.side * this.side);
	}

	public void sPerimeter() {
		System.out.println("Perimeter of square is:" + 4 * this.side);
	}

}
