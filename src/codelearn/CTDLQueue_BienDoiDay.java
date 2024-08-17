package codelearn;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class CTDLQueue_BienDoiDay {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		try (Scanner input = new Scanner(System.in)) {
			int intPosNum = input.nextInt();
			queue = readIntPosNum(input, intPosNum);
			int intPosNum2nd = input.nextInt();
			printChaneQueue(queue, intPosNum2nd);
		}
	}

	private static void printChaneQueue(Queue<Integer> queue, int intPosNum2nd) {
		for (int i = 0; i < intPosNum2nd; i++) {
			int temp = queue.poll();
			queue.add(temp);
		}
		while (!queue.isEmpty()) {
			System.out.print(queue.poll() + " ");
		}
	}

	private static Queue<Integer> readIntPosNum(Scanner input, int intPosNum) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		for (int i = 0; i < intPosNum; i++) {
			queue.add(input.nextInt());
		}
		return queue;
	}
}
