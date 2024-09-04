package arrays;
import java.util.Scanner;
public class arr02 {
    
public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("enter position to be insert");
    int pos= sc.nextInt();
    System.out.println("enter element to be insert");
    int ele =sc.nextInt();
    int arr[]= {78,79,90,58,61,54,0};
    for (int i=pos;i<(arr.length-1);i++)
        {arr[i+1]=arr[i];
              
        }arr[pos]=ele; 
        insertion(ele, pos, arr);



}
    public static void insertion(int ele,int pos,int arr[]){
        


        for (int i=0;i<arr.length;i++ ){
        System.err.println(arr[i]+',');
        }

    }

}
