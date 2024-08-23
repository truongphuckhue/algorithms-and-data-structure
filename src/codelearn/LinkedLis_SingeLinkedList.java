package codelearn;

import java.util.Scanner;

public class LinkedLis_SingeLinkedList {
	public static void main(String[] agrs) {
		try (Scanner scanner = new Scanner(System.in)) {
			int num = scanner.nextInt();
			LinkedList linkedList = new LinkedList();
			for (int i = 0; i < num; i++) {
				linkedList.append(scanner.nextInt());
			}
			linkedList.printList();
		}
	}
}

class LinkedList {
	Node head;

	public void append(int data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = new Node(data);
	}

	public void printList() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}
	}
}

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}