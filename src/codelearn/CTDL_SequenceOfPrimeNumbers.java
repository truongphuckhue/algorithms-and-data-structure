package codelearn;

import java.util.Scanner;

public class CTDL_SequenceOfPrimeNumbers {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int positiveInt = input.nextInt();
			int[] arrayPosInt = getInputArray(input, positiveInt);
			for (int numbers : arrayPosInt) {
				if (isPrimeSequence(numbers)) {
					printarrayPosInt(numbers);
				}
			}
		}
	}

	private static void printarrayPosInt(int numbers) {
		System.out.print(numbers + " ");
	}

	private static boolean isPrimeSequence(int numbers) {
		if (numbers <= 1) {
			return false;
		}
		int count = 0;
		int i = 2;
		int div = numbers;
		while (div != 1) {
			if (div % i == 0) {
				div = div / i;
				count++;
			} else {
				i++;
			}
		}
		if (count < 2) {
			return true;
		}
		return false;
	}

	private static int[] getInputArray(Scanner input, int positiveInt) {
		int[] array = new int[positiveInt];
		for (int i = 0; i < positiveInt; i++) {
			array[i] = input.nextInt();
		}
		return array;
	}
}
