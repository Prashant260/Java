import java.util.Arrays;
import java.util.Scanner;

public class insertionsort {

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
        insertionsort(arr);
        }

         static void insertionsort(int [] arr) {
            for (int i = 0; i < arr.length-1; i++) {

                for (int j = i+1; j >0; j--) {
                    if (arr[j-1]>=arr[j]){
                        int temp =arr[j-1];
                        arr[j-1] = arr[j];
                        arr[j]=temp;
                            
                        }
                        else {
                             break;

                            
                        }
                    }
                    
                }
          System.out.println(Arrays.toString(arr));  
         }
            
        
    
    
    }
    
