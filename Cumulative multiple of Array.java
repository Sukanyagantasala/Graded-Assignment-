package assignment;
import java.util.Scanner;
public class CumulativeMultiple {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();
	        
	        if (n <= 0) {
	            System.out.println("Number of elements must be greater than zero.");
	            return;
	        }
	        
	        int[] arrNum = new int[n];
	        
	        System.out.println("Enter the elements of the array:");
	        for (int i = 0; i < n; i++) {
	            arrNum[i] = sc.nextInt();
	        }
	        
	        sc.close();
	        
	        try {
	            calculateCumulativeMultiple(arrNum);
	            System.out.print("Output: arrNum = [");
	            for (int i = 0; i < n; i++) {
	                System.out.print(arrNum[i]);
	                if (i != n - 1) {
	                    System.out.print(", ");
	                }
	            }
	            System.out.println("]");
	        } catch (Exception e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

	    public static void calculateCumulativeMultiple(int[] arr) throws Exception {
	        if (arr.length == 0) {
	            throw new Exception("Array is empty.");
	        }

	        if (arr[0] == 0) {
	            throw new Exception("The first element of the array cannot be zero.");
	        }

	        int cumulativeMultiple = arr[0];
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] == 0) {
	                arr[i] = 0; 
	            } else {
	                cumulativeMultiple *= arr[i];
	                arr[i] = cumulativeMultiple;
	            }
	        }
	    }
	}



