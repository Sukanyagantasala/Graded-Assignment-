package assignment;
import java.util.Scanner;
public class CountOfSingulars {
	public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter the number of elements in the array: ");
	        int n = sc.nextInt();

	        int[] arr = new int[n];
	        System.out.println("Enter the elements of the array: ");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        sc.close();

	        int singularSocks = countSingularSocks(arr);
	        System.out.println("Count of singular socks = " + singularSocks);
	    }

	    public static int countSingularSocks(int[] arr) {
	        int SockId = getMaxSockId(arr);
	        int[] sockFrequency = new int[SockId + 1];
	        for (int sockId : arr) {
	            sockFrequency[sockId]++;
	        }

	        int singularSocks = 0;
	        for (int i = 1; i <= SockId; i++) {
	            if (sockFrequency[i] % 2 == 1) {
	                singularSocks += 1;
	            }
	        }

	        return singularSocks;
	    }
    public static int getMaxSockId(int[] arr) {
	        int maxSockId = arr[0];
	        for (int sockId : arr) {
	            if (sockId > maxSockId) {
	                maxSockId = sockId;
	            }
	        }
	        return maxSockId;
	    }
	}



