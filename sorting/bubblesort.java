import java.util.Arrays;
import java.util.Scanner;

public class bubblesort {
    public static void main(String[] args) { 
        
        Scanner  sc =new Scanner(System.in);
    // creating an array
        System.out.println("enter the size of the array: ");
        int n=sc.nextInt();
        int arr [] =new int[n];
    // taking inputs in the array
        System.out.println("enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();    
        }System.out.println(Arrays.toString(arr));
        sort(arr);


        
    }  
    static void sort(int arr []) {
        boolean swapped;
        //compare adjacent elements of an array
        for (int j = 0; j < arr.length; j++) {
            swapped=false;
        
                    for (int i = 0; i < arr.length -i; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i] =arr[i+1];
                    arr[i+1]=temp; 
                        swapped=true;
                }
            }
            if (swapped== false) {
break;                
            }System.out.println(Arrays.toString(arr));
           
        
    }
}
}

