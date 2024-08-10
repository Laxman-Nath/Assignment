package bookstore;

import java.util.Scanner;

public class Book {
	private String title;
	private String author;
	private double price;
	private String publisher;
	private long ISBN;
	private String[] titleArray = new String[10];
	private String[] authorArray = new String[10];
	private double[] priceArray = new double[2];
	private String[] publisherArray = new String[10];
	private long[] ISBNArray = new long[10];
	private int bookCount = 0;
	private double totalCost = 0.0;
	private double maxCost = 0.0;
	private double minCost = 0.0;

	public void storeData() {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 2; i++) {

			System.out.println("Enter title of your book");
			title = sc.nextLine();
			titleArray[i] = title;
			System.out.println("Enter price of your book");
			price = sc.nextDouble();
			priceArray[i] = price;
			sc.nextLine();
			System.out.println("Enter author of your book");
			author = sc.nextLine();
			authorArray[i] = author;
			System.out.println("Enter publisher of your book");
			publisher = sc.nextLine();
			publisherArray[i] = publisher;
			System.out.println("Enter ISBN of your book");
			ISBN = sc.nextLong();
			ISBNArray[i] = ISBN;
			bookCount++;
			sc.nextLine();
		}
	}

	public void displayBook() {
		System.out.println("Title      Author      Price      Publisher       ISBN");
		System.out.println("====       ========    ======     =======         =====");
		for (int i = 0; i < 2; i++) {
			System.out.printf("%-7s   %-10s   £%-7.2f   %-10s  %013d%n", titleArray[i], authorArray[i], priceArray[i],
					publisherArray[i], ISBNArray[i]);
		}
	}

	public double calculateTotal() {
		for (int i = 0; i < priceArray.length; i++) {
			totalCost += priceArray[i];
		}
		return totalCost;
	}

	public double calculateMax() {
		maxCost = priceArray[0];
		for (int i = 1; i < priceArray.length; i++) {
			if (priceArray[i] > maxCost) {
				maxCost = priceArray[i];
			}
		}
		return maxCost;
	}

	public double calculateMin() {
		minCost = priceArray[0];
		for (int i = 1; i < priceArray.length; i++) {
			if (priceArray[i] < minCost) {
				minCost = priceArray[i];
			}
		}
		return minCost;
	}

	public double calculateAvg() {
		return totalCost / bookCount;
	}

	public void generateReport() {
		int i = 1;
		while (i < 5) {
			System.out.println(i + ".  The total number of books:" + bookCount);
			i++;
			System.out.println(i + ".  The total cost of books:" + calculateTotal());
			i++;
			System.out.println(i + ".  The maximum cost of books:" + calculateMax());
			i++;
			System.out.println(i + ".  The minimum cost of books:" + calculateMin());
			i++;
			System.out.println(i + ".  The average cost of book:" + calculateAvg());
		}
	}

	public static void main(String[] args) {
		Book b = new Book();
		b.storeData();
		System.out.println("/************************************/");
		b.displayBook();
		System.out.println("/************************************/");
		b.generateReport();

	}
}
