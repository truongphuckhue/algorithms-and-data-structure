package codelearn;

import java.util.Scanner;
import java.util.Stack;

public class CTDLStack_NenChuoi {
	public static void main(String[] agrs) {
		try (Scanner input = new Scanner(System.in)) {
			String strInput = input.nextLine();
			nenChuoi(strInput);
		}
	}

	private static void nenChuoi(String strInput) {
		Stack<String> strStack = new Stack<String>();
		if (strInput == null || strInput.isEmpty()) {
			return;
		}
		strStack.push(String.valueOf(strInput.charAt(0)));
		int count = 1;
		for (int i = 1; i < strInput.length(); i++) {
			String currentChar = String.valueOf(strInput.charAt(i));
			if (strStack.peek().equals(currentChar)) {
				count++;
			} else {
				strStack.push(String.valueOf(count));
				count = 1;
				strStack.push(currentChar);
			}
		}
		strStack.push(String.valueOf(count));
		while (!strStack.empty()) {
			System.out.print(strStack.remove(0));
		}
	}

	/*
	 * private static void nenChuoi(String strInput) { Stack<String> strStack = new
	 * Stack<>(); int count = 1; if (strInput == null || strInput.isEmpty()) {
	 * return; } strStack.push(String.valueOf(strInput.charAt(0))); for (int i = 1;
	 * i < strInput.length(); i++) { String currentChar =
	 * String.valueOf(strInput.charAt(i)); if (strStack.peek().equals(currentChar))
	 * { count++; } else { strStack.push(String.valueOf(count)); count = 1;
	 * strStack.push(String.valueOf(strInput.charAt(i))); } }
	 * strStack.push(String.valueOf(count));
	 * 
	 * while (!strStack.isEmpty()) { System.out.print(strStack.remove(0)); } }
	 */
}
