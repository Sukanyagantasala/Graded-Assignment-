package assignment;
import java.util.*;

	class Node {
	    int data;
	    Node next;

	    Node(int data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	public class RemoveDuplicatesFromLinkedList {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the elements of the Linked-List separated by spaces:");
	        String input = sc.nextLine();
	        Node head = createLinkedList(input);

	        Node uniqueList = removeDuplicates(head);

	        System.out.println("Linked List after removing duplicates:");
	        printLinkedList(uniqueList);
	    }

	    public static Node createLinkedList(String input) {
	        String[] elements = input.trim().split("\\s+");
	        Node head = null;
	        Node tail = null;

	        for (String element : elements) {
	            int data = Integer.parseInt(element);
	            Node newNode = new Node(data);

	            if (head == null) {
	                head = newNode;
	                tail = newNode;
	            } else {
	                tail.next = newNode;
	                tail = newNode;
	            }
	        }
	        return head;
	    }

	    public static Node removeDuplicates(Node head) {
	        if (head == null)
	            return null;

	        Node current = head;
	        while (current != null) {
	            Node run = current;
	            while (run.next != null) {
	                if (run.next.data == current.data) {
	                    run.next = run.next.next;
	                } else {
	                    run = run.next;
	                }
	            }
	            current = current.next;
	        }

	        return head;
	    }

	    public static void printLinkedList(Node head) {
	        Node current = head;
	        while (current != null) {
	            System.out.print(current.data);
	            if (current.next != null) {
	                System.out.print("->");
	            }
	            current = current.next;
	        }
	        System.out.println();
	    }
	}



