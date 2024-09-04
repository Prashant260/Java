package arrays;

import java.util.Scanner;

public class arr01 { 
     
    public static void main(String[] args) {
        //declaration of an array.
       int myArra[] = {6,7,8,6,5,9};
       
       deletion(myArra);
    }
 
    
    public static void deletion(int arr[]){

        int  size= arr.length;
        System.out.println(size);
       
        arr[arr.length-1]=0;
        for (int j=0;j<arr.length;j++){
        System.out.print(arr[j]+',');}
    }
}
 