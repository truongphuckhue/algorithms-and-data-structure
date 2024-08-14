package codelearn;

import java.util.Scanner;

public class CTDL_GhepDay {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int intPosNumFirst = input.nextInt();
			int[] arrIntPosNumFirst = readPosNum(input, intPosNumFirst);
			int intPosNumSecond = input.nextInt();
			int[] arrIntPosNumSecond = readPosNum(input, intPosNumSecond);
			printMatchTwoArr(matchTwoArr(arrIntPosNumFirst, arrIntPosNumSecond));
		}

	}

	private static void printMatchTwoArr(int[] matchTwoArr) {
		for (int number : matchTwoArr) {
			System.out.print(number + " ");
		}

	}

	private static int[] matchTwoArr(int[] arrIntPosNumFirst, int[] arrIntPosNumSecond) {
		int size = arrIntPosNumFirst.length + arrIntPosNumSecond.length;
		int[] arrMatch = new int[size];
		for (int i = 0; i < size; i++) {
			if (i < arrIntPosNumFirst.length) {
				arrMatch[i] = arrIntPosNumFirst[i];
			}
			if (i < arrIntPosNumSecond.length) {
				arrMatch[arrIntPosNumFirst.length + i] = arrIntPosNumSecond[i];
			}
		}
		sortArrMath(arrMatch);
		return arrMatch;
	}

	private static void sortArrMath(int[] arrMatch) {
		for (int i = 0; i < arrMatch.length - 1; i++) {
			for (int j = 0; j < arrMatch.length - i - 1; j++) {
				if (arrMatch[j] > arrMatch[j + 1]) {
					int temp = arrMatch[j];
					arrMatch[j] = arrMatch[j + 1];
					arrMatch[j + 1] = temp;
				}
			}
		}
	}

	public static int[] readPosNum(Scanner input, int size) {
		int[] arrIntPosNum = new int[size];
		for (int i = 0; i < size; i++) {
			arrIntPosNum[i] = input.nextInt();
		}
		return arrIntPosNum;
	}

}
