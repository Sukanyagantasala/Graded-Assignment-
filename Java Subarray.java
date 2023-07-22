import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int c=0;
        int arr[]=new int[a];
        for(int i=0;i<a;i++){
            arr[i]=s.nextInt();
        }
        for(int j=0;j<a;j++){
            int sum=0;
            for(int k=j;k<a;k++){
                sum=sum+arr[k];
                if(sum<0)
                  c++;
            }
            
        }
        System.out.println(c)
    }
}
