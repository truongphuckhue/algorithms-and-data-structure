package codelearn;

import java.util.LinkedList;
import java.util.Scanner;

public class SinglyLinkedList_QueryElement {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
			int inputNum = scanner.nextInt();
			for (int i = 0; i < inputNum; i++) {
				linkedList.add(scanner.nextInt());
			}
			int index = scanner.nextInt();
			System.out.println(linkedList.get(index));
		}

	}

}
