package codelearn;

import java.util.Scanner;

public class CTDL_Array {
	
	public static void main(String[] agrs) {
		try (Scanner input = new Scanner(System.in)) {
			int numberOfElement = input.nextInt();
			int[] arrayNumberOfElement = readNumberOfElement(input, numberOfElement);
			printSum(arrayNumberOfElement);
		}
	}

	private static void printSum(int[] arrayNumberOfElement) {
		System.out.print("Sum: " + sumNumber(arrayNumberOfElement));
	}

	private static int sumNumber(int[] arrayNumberOfElement) {
		int sum = 0;
		for (int number : arrayNumberOfElement) {
			sum += number;
		}
		return sum;
	}

	private static int[] readNumberOfElement(Scanner input, int numberOfElement) {
		int[] arrayNumberOfElement = new int[numberOfElement];
		for (int i = 0; i < numberOfElement; i++) {
			arrayNumberOfElement[i] = input.nextInt();
		}
		return arrayNumberOfElement;
	}
}
