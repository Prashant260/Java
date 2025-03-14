package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class binarySearch {
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
        binarysearch(arr);
    }

    static void binarysearch(int arr[]){
        System.out.println("enter the element to search: ");
        Scanner  in =new Scanner(System.in);
        int target = in.nextInt();
        int start = 0;
        int end = arr.length-1;
        while (start<=end){
        int mid = (start+end)/2;
        
        
        if (arr[mid]==target){
            System.out.println("at index: " + mid);

        }
        if(target>arr[mid]) {
            start=mid+1;

        }
        else{
            end = mid-1;

        }
        

    }
    }
}
