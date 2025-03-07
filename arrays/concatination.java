package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class concatination {
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
       
        int result [] = new int[2*n];
        for (int i=0;i<n;i++){
            result[i] = arr[i];    
        }
        for(int i=0; i<n; i++){
            result [i+n] = arr[i];
        }
          System.out.println(Arrays.toString(result));
        }

        

            }
                  
    

