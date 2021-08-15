package com.javaGenerics;

public class GenericsMaxValue {
	public static void main(String[] args) {
		printMax(testMaximumInteger(100, 500, 400));
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

	public static int testMaximumInteger(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0) {
			max = y;
		}
		if (z.compareTo(max) > 0) {
			max = z;
		}
		return max;
	}

	private static void printMax(Integer max) {
		System.out.println(" Maximum number is : " + max);
	}
}
