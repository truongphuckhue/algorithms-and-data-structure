package codelearn;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedLis_SingeLinkedList {
	public static void main(String[] agrs) {
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			LinkedList<Integer> linkedList = new LinkedList<Integer>();
			for (int i = 0; i < num; i++) {
				linkedList.add(scanner.nextInt());
			}
			for (int numList : linkedList) {
				System.out.print(numList + " ");
			}
		}
	}
}
