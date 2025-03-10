package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class evenDigits {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Scanner  in =new Scanner(System.in);
    // creating an array
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int arr [] =new int[n];
    // taking inputs in the array
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();    
        }System.out.println(Arrays.toString(arr));
        evenDigits(arr);

    }
    static void evenDigits(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            int count =0;
            while ( num > 0){
                num = num/10;
                 count++;
                 
                 
            }
            if (count%2==0){
            System.out.println(arr[i] + " has even digits") ;
        }

                }



    }
}
