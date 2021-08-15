package com.javaGenerics;

public class GenericsMaxValue {
	public static void main(String[] args) {
		printMax(testMaximumInteger(100, 500, 400,800));
		printMax(testMaximumDouble(1.1, 1.2, 1.3,2.1));
		printMax(testMaximumString("Arun", "Avinash", "Arjun","Ramanjum"));
	}

	public static <E extends Comparable<E>> E max(E[] list) {
		E max = list[0]; // sets the first value in the array as the current maximum
		for (int i = 1; i < list.length; i++) {
			if (list[i].compareTo(max) > 0) // if value in list[i] is greater than max and is positive(greater than 0),
				max = list[i];				// the max value is replaced by list[i] {
				
		}
		return max;
	}

	private static <E> void toPrint(E[] max) {
		for (E i : max) {
			System.out.println(i);
		}
	}

	public static int testMaximumInteger(Integer x, Integer y, Integer z,Integer a) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		if (a.compareTo(max) > 0) {
			max = a;
		}
		return max;
	}

	public static double testMaximumDouble(Double x, Double y, Double z,Double a) {
		Double max1 = x;
		if (y.compareTo(max1) > 0) {
			max1 = y;
		}
		if (z.compareTo(max1) > 0) {
			max1 = z;
		}
		if (a.compareTo(max1) > 0) {
			max1 = a;
		}
		return max1;
	}

	public static String testMaximumString(String first, String second, String third,String fourth) {
		int max = first.length();
		String letter = first;
		if (second.length() > max) {
			max = second.length();
			letter = second;
		}
		if (third.length() > max) {
			max = third.length();
			letter = third;
		}
		if (fourth.length() > max) {
			max = fourth.length();
			letter = fourth;
		}
		return letter;
	}

	@SuppressWarnings("unused")
	private static void printMax(Integer max) {
		System.out.println(" Maximum number is : " + max);
	}

	private static void printMax(double max) {
		System.out.println(" Maximum integer  number is : " + max);
	}

	private static void printMax(String max) {
		System.out.println(" Maximum String length is : " + max);
	}
}