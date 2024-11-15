import java.util.*;

class Node {
	int data;
	Node next, prev;
	Node(int data) {
		this.data = data;
	}
}

public class DoublyLinkedList {
	public static void main(String args[]) {
		int ch;
		int data;
		Node head = null, tail = null;
		Node temp = new Node(0);
		Scanner sc = new Scanner(System.in);
		System.out.println("\nMENU\n");
		System.out.println("1.Insert element\n2.Delete element\n3.Display elements\n4.Exit");
		while(true) {
			System.out.print("\nEnter you choice : ");
			ch = sc.nextInt();
			switch(ch) {
				case 1:
					System.out.print("Enter the data to insert  : ");
					data = sc.nextInt();
					Node node = new Node(data);
					if(head == null && tail == null) {
						head = node;
						tail = node;
						head.prev = null;
						head.next = null;
						tail.next = null;
						tail.next = null;
						System.out.println("Element inserted");
					} else {
						tail.next = node;
						node.prev = tail;
						node.next = null;
						tail = node;
						System.out.println("Element inserted");
					}
					break;

				case 2:
					if(head == null) {
						System.out.println("List Empty");
						break;
					}
					System.out.print("Enter the data to delete  : ");
					int key = sc.nextInt();
					if(head == tail) {
						head = null;
						tail = null;
					} 
					else if(head.data == key && head.next != null) {
						head = head.next;
						head.prev = null;
					} 
					else {
						int flag = 0;
						temp = head;
						while(temp != null) {
							if(temp.data == key) {
								flag = 1;
								if(temp.prev != null) {
									temp.prev.next = temp.next;
								} else temp.prev = null;
								if(temp.next != null) {
									temp.next.prev = temp.prev;
								} else temp.next = null;
							}
							if(temp.data == key && temp.prev == null) {
								flag = 1;
								head = null;
								tail = null;
							}
							temp = temp.next;
						}
						if(flag == 0) {
							System.out.println("Element not found");
						} else {
							System.out.println("Element deleted");
						}
					}
					break;

				case 3:
					if(tail == null) {
						System.out.println("List Empty");
					} else {
						temp = head;
						while(temp != null) {
							System.out.print(temp.data + "  ");
							temp = temp.next;
						}
						System.out.println();
					}
					break;

				case 4:
					break;

				default:
					System.out.println("Wrong Choice");
			}
			if(ch == 4) break;
		}
	}
}