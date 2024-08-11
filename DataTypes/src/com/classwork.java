package com;

public class classwork {
	public static void main(String[] args) {
		int i = 1;

		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.printf("|%6s  | %7s | %7s | %-25s | %-321s |", "S.N", "Data Type", "Size", "MIN_VALUE", "MAX_VALUE");
		while (i < 7) {
			System.out.println();
			System.out.println(
					"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.printf("|%6d  | %9s | %2d bits | %20d bits | %-316d bits |%n", i, "byte", Byte.SIZE,
					Byte.MIN_VALUE, Byte.MAX_VALUE);
			i++;
			System.out.printf("|%6d  | %9s | %2d bits | %20d bits | %-316d bits |%n", i, "short", Short.SIZE,
					Short.MIN_VALUE, Short.MAX_VALUE);
			i++;
			System.out.printf("|%6d  | %9s | %2d bits | %20d bits | %-316d bits |%n", i, "int", Integer.SIZE,
					Integer.MIN_VALUE, Integer.MAX_VALUE);
			i++;
			System.out.printf("|%6d  | %9s | %2d bits | %20d bits | %-316d bits |%n", i, "long", Long.SIZE,
					Long.MIN_VALUE, Long.MAX_VALUE);
			i++;
			System.out.printf("|%6d  | %9s | %2d bits | %20f bits | %-316f bits |%n", i, "float", Float.SIZE,
					Float.MIN_VALUE, Float.MAX_VALUE);
			i++;
			System.out.printf("|%6d  | %9s | %2d bits | %20f bits | %-316f bits |%n", i, "double", Double.SIZE,
					Double.MIN_VALUE, Double.MAX_VALUE);
			i++;
			System.out.printf("|%6d  | %9s | %2d bits | %20c bits | %-317c bits |%n", i, "character", Character.SIZE,
					Character.MIN_VALUE, Character.MAX_VALUE);

		}
		System.out.println(
				"------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

	}
}
