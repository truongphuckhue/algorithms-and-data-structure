package codelearn;

import java.util.Scanner;

public class CTDL_DaySoDonDieu {

	public static void main(String[] agrs) {
		try (Scanner input = new Scanner(System.in)) {
			int inputNum = input.nextInt();
			int[] arrInputNum = readInputNum(input, inputNum);
			System.out.print(checkArrInputNum(arrInputNum));
		}
	}

	private static String checkArrInputNum(int[] arrInputNum) {
		int temp = arrInputNum[0];
		boolean isAscending = arrInputNum[0] < arrInputNum[1];
		for (int i = 1; i < arrInputNum.length; i++) {
			if (isAscending && arrInputNum[i] >= temp || 
					!isAscending && arrInputNum[i] <= temp) {
				temp = arrInputNum[i];
			} else {
				return "NO";
			}
		}

		return "YES";
	}

	private static int[] readInputNum(Scanner input, int inputNum) {
		int[] arrInputNum = new int[inputNum];
		for (int i = 0; i < inputNum; i++) {
			arrInputNum[i] = input.nextInt();
		}
		return arrInputNum;
	}
}
