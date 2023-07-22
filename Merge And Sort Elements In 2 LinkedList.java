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
public class MergeAndSort {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Enter the elements of Linked-List-1 separated by spaces:");
	        String input1 = sc.nextLine();
	        Node list1 = createLinkedList(input1);

	        System.out.println("Enter the elements of Linked-List-2 separated by spaces:");
	        String input2 = sc.nextLine();
	        Node list2 = createLinkedList(input2);

	        Node mergedList = mergeLinkedLists(list1, list2);
	        Node sortedMergedList = sortLinkedList(mergedList);

	        System.out.println("Merged and Sorted Linked List:");
	        printLinkedList(sortedMergedList);
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

	    public static Node mergeLinkedLists(Node list1, Node list2) {
	        if (list1 == null)
	            return list2;
	        if (list2 == null)
	            return list1;

	        if (list1.data < list2.data) {
	            list1.next = mergeLinkedLists(list1.next, list2);
	            return list1;
	        } else {
	            list2.next = mergeLinkedLists(list1, list2.next);
	            return list2;
	        }
	    }

	    public static Node sortLinkedList(Node head) {
	        if (head == null || head.next == null)
	            return head;

	        Node mid = findMiddle(head);
	        Node midNext = mid.next;
	        mid.next = null;

	        Node left = sortLinkedList(head);
	        Node right = sortLinkedList(midNext);

	        return mergeLinkedLists(left, right);
	    }

	    public static Node findMiddle(Node head) {
	        if (head == null)
	            return head;

	        Node slowPtr = head;
	        Node fastPtr = head.next;

	        while (fastPtr != null && fastPtr.next != null) {
	            slowPtr = slowPtr.next;
	            fastPtr = fastPtr.next.next;
	        }

	        return slowPtr;
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
