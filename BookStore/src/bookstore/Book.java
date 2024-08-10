package bookstore;

import java.util.Scanner;

public class Book {

	public static void main(String[] args) {

		String title;
		String author;
		double price;
		String publisher;
		long ISBN;
		String[] titleArray = new String[10];
		String[] authorArray = new String[10];
		double[] priceArray = new double[10];
		String[] publisherArray = new String[10];
		long[] ISBNArray = new long[10];
		int bookCount = 0;
		double totalCost = 0.0;
		double maxCost = 0.0;
		double minCost = 0.0;
		double average = 0.0;

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 10; i++) {

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

		System.out.println("Title      Author      Price      Publisher       ISBN");
		System.out.println("====       ========    ======     =======         =====");
		for (int i = 0; i < 10; i++) {
			System.out.printf("%-7s   %-10s   £%-7.2f   %-10s  %013d%n", titleArray[i], authorArray[i], priceArray[i],
					publisherArray[i], ISBNArray[i]);
		}

		for (int i = 0; i < priceArray.length; i++) {
			totalCost += priceArray[i];
		}

		maxCost = priceArray[0];
		for (int i = 1; i < priceArray.length; i++) {
			if (priceArray[i] > maxCost) {
				maxCost = priceArray[i];
			}
		}

		minCost = priceArray[0];
		for (int i = 1; i < priceArray.length; i++) {
			if (priceArray[i] < minCost) {
				minCost = priceArray[i];
			}
		}
		
		int i = 1;
		while (i < 5) {
			System.out.println(i + ".  The total number of books:" + bookCount);
			i++;
			System.out.println(i + ".  The total cost of books:£" + totalCost);
			i++;
			System.out.println(i + ".  The maximum cost of books:£" + maxCost);
			i++;
			System.out.println(i + ".  The minimum cost of books:£" + minCost);
			i++;
			System.out.println(i + ".  The average cost of book:£" + (totalCost/bookCount));
		}


	}
}
