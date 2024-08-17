package codelearn;

import java.util.Scanner;
import java.util.Stack;

public class CTDLStack {
	public static void main(String[] agrs) {
		Stack<String> stack = new Stack<String>();
		try (Scanner input = new Scanner(System.in)) {
			String text = input.nextLine();
			for (int i = 0; i < text.length(); i++) {
				stack.push(String.valueOf(text.charAt(i)));
			}
			while (!stack.empty()) {
				System.out.print(stack.pop());
			}
		}
	}
}
