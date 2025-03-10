package arrays;


import java.util.Arrays;
import java.util.Scanner;

public class minimum{
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
        }
        System.out.println(Arrays.toString(arr));
        mini(arr);
        System.out.println(Arrays.toString(arr));
 
    }

    static void mini(int arr []){
        
        int min= arr[0];
         for (int i = 0; i < arr.length; i++) {
            if ( min >= arr[i]){
                min =arr[i];
            }         
        }System.out.println("the minimum no. in this array is: " + min);
    }
}
