package codelearn;

import java.util.Scanner;

public class CTDL_ChenPhanTu {

	public static void main(String[] agrs) {
		try (Scanner input = new Scanner(System.in)) {
			int numberInput = input.nextInt();
			int[] arrayNumberInput = readNumberInput(input, numberInput);
			int knumberInput = input.nextInt();
			arrayNumberInput = deleteknumberInput(knumberInput, arrayNumberInput, numberInput);
			printFinalArrayNumberInput(arrayNumberInput);
		}
	}

	private static void printFinalArrayNumberInput(int[] arrayNumberInput) {
		for (int numbers : arrayNumberInput) {
			System.out.print(numbers);
		}

	}

	public static int[] deleteknumberInput(int knumberInput, int[] arrayNumberInput, int numberInput) {
		int[] newArrayNumberInput = new int[numberInput];
		for (int i = 0; i < numberInput; i++) {
			if (i != knumberInput) {
				newArrayNumberInput[i] = arrayNumberInput[i];
			} else {
				newArrayNumberInput[i] = arrayNumberInput[i + 1];
				i++;
			}
		}
		return newArrayNumberInput;
	}

	public static int[] readNumberInput(Scanner input, int numberInput) {
		int[] arrayNumberInput = new int[numberInput];
		for (int i = 0; i < numberInput; i++) {
			arrayNumberInput[i] = input.nextInt();
		}
		return arrayNumberInput;
	}
}
