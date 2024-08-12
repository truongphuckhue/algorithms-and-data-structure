package codelearn;

import java.util.Scanner;

public class CTDL_MangDanhDau {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int intPosNum = input.nextInt();
			int[] arrIntPosNum = readIntPosNum(input, intPosNum);
			sortArray(arrIntPosNum);
			String result = countElementInArray(arrIntPosNum);
			System.out.println(result);
		}
	}

	private static void sortArray(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	private static String countElementInArray(int[] arrIntPosNum) {
		String result = "";
		int count = 1;
		int temp = arrIntPosNum[0];
		for (int i = 1; i < arrIntPosNum.length; i++) {
			if (arrIntPosNum[i] == temp) {
				count++;
			} else {
				result += temp + " - " + count + "; ";
				temp = arrIntPosNum[i];
				count = 1;
			}
		}
		result += temp + " - " + count + "; ";
		return result;
	}

	private static int[] readIntPosNum(Scanner input, int intPosNum) {
		int[] arrIntPosNum = new int[intPosNum];
		for (int i = 0; i < intPosNum; i++) {
			arrIntPosNum[i] = input.nextInt();
		}
		return arrIntPosNum;
	}

}
