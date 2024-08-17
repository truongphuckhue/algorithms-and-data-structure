package codelearn;

import java.util.Scanner;
import java.util.Stack;

public class CTDLStack_ChuyenSoThanhChuoiNhiPhan {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			int intPosNum = input.nextInt();
			stackBin(intPosNum);
		}
	}

	private static void stackBin(int intPosNum) {
		Stack<Integer> stack = new Stack<>();
		if (intPosNum == 0) {
			System.out.print(0);
			return;
		}
		while (intPosNum != 1) {
			stack.push(intPosNum % 2);
			intPosNum = intPosNum / 2;
		}
		stack.push(1);
		while (!stack.empty()) {
			System.out.print(stack.pop());
		}
	}
}
