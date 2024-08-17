package codelearn;

import java.util.LinkedList;
import java.util.Scanner;

public class SinglyLinkedList_DeleteElement {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
			int numInput = scanner.nextInt();
			for (int i = 0; i < numInput; i++) {
				linkedList.add(scanner.nextInt());
			}
			int indexRemove = scanner.nextInt();
			linkedList.remove(indexRemove);
			for (int num : linkedList) {
				System.out.print(num + " ");
			}
		}
	}
}
