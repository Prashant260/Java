package arrays;
// this program shos that how you can find the maximum value in an input  array
import java.util.Arrays;
import java.util.Scanner;

public class maxValue {
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
        maxValue(arr);
    }
    static void maxValue(int arr[]){
        int max=0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i]>=max){
                max= arr[i];
            }

        }System.out.println("the maximum value in this array is : " + max);
            
        }
    }

