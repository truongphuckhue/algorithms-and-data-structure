package codelearn;

import java.util.Scanner;

public class CTDL_XoaPhanTu {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int positiveIntN = input.nextInt();
		int[] arrayPositiveInt = savePosIntToArr(input, positiveIntN);
		int intK = input.nextInt();
		arrayPositiveInt = deleteIndexK(arrayPositiveInt, intK, positiveIntN);
		printFinalArray(arrayPositiveInt);
		input.close();
	}

	private static void printFinalArray(int[] arrayPositiveInt) {
		for (int numbers : arrayPositiveInt) {
			System.out.print(numbers + " ");
		}

	}

	private static int[] deleteIndexK(int[] arrayPositiveInt, int intK, int positiveIntN) {
		int[] newArrayPositiveInt = new int[positiveIntN - 1];
		int newIndex = 0;
		for (int i = 0; i < positiveIntN; i++) {
			if (i != intK) {
				newArrayPositiveInt[newIndex] = arrayPositiveInt[i];
				newIndex++;
			}
		}
		return newArrayPositiveInt;
	}

	private static int[] savePosIntToArr(Scanner input, int positiveIntN) {
		int[] arrayPositiveInt = new int[positiveIntN];
		for (int i = 0; i < positiveIntN; i++) {
			arrayPositiveInt[i] = input.nextInt();
		}
		return arrayPositiveInt;
	}

}
