package codelearn;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CTDLQueue_SuperPrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();

		Queue<Integer> queue = new LinkedList<>();

		// Thêm các số nguyên tố nhỏ hơn hoặc bằng 9 vào hàng đợi
		for (int i = 2; i <= Math.min(n, 9); i++) {
			if (isPrime(i)) {
				queue.add(i);
			}
		}

		// Tạo các số nguyên tố bằng cách thêm chữ số vào cuối số hiện tại
		while (!queue.isEmpty()) {
			int current = queue.poll();
			for (int i = 1; i <= 9; i++) {
				int newNumber = current * 10 + i;
				if (newNumber <= n && isPrime(newNumber)) {
					queue.add(newNumber);
				}
			}
			System.out.print(current + " ");
		}
	}

	private static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		}
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}
}