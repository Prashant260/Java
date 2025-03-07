package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class runing_sum {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter total no. of elements: ");
            int size=in.nextInt();
        
        int arr[]=new int[size];
         Scanner sc=new Scanner(System.in);
           System.out.println("enter elements: ");
            for (int i =0; i<size;i++){
             arr[i]=sc.nextInt();   
        }
           System.out.println(Arrays.toString(arr));
        
        int result[]=new int[size];
         result[0]=arr[0];
             for(int j=1;j<size;j++){
                 result[j]=result[j-1]+arr[j];
            }        
           System.out.println(Arrays.toString(result));



    }
}
