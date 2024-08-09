package codelearn;

import java.util.Scanner;

public class CTDL_CapNhatPhanTu {

	public static void main(String[] agrs) {
		try (Scanner input = new Scanner(System.in)) {
			int numberOfElement = input.nextInt();
			int[] numbers = readNumbers(input, numberOfElement);
			printSquares(numbers);
		}
	}

	private static void printSquares(int[] numbers) {
		for (int number : numbers) {
			System.out.print(square(number) + " ");
		}

	}

	private static int[] readNumbers(Scanner input, int numberOfElement) {
		int[] numbers = new int[numberOfElement];
		for (int i = 0; i < numberOfElement; i++) {
			numbers[i] = input.nextInt();
		}
		return numbers;
	}

	private static int square(int number) {
		return number * number;
	}
}
