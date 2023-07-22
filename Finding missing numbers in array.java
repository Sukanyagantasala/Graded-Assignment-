package assignment;
import java.util.Scanner;
public class MissingNumbers {
	
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array (Enter the consecutive Numbers ,Some of which may be missing):");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        sc.close();

	        System.out.print("Output: Missing Numbers = ");
	        findMissingNumbers(arr);
	    }

	    public static void findMissingNumbers(int[] arr) {
	        int start = arr[0];
	        int end = arr[arr.length - 1];

	        int count = 0;
	        for (int i = start; i <= end; i++) {
	            boolean found = false;
	            for (int num : arr) {
	                if (num == i) {
	                    found = true;
	                    break;
	                }
	            }
	            if (!found) {
	                if (count > 0) {
	                    System.out.print(", ");
	                }
	                System.out.print(i);
	                count++;
	            }
	        }

	        if (count == 0) {
	            System.out.println("Missing numbers are not found.");
	        } else {
	            System.out.println();
	        }
	    }
	}



