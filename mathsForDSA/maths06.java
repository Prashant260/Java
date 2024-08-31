package mathsForDSA;

import java.util.Scanner;

public class maths06 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        primeNumber(num);
    }
    
    public static void primeNumber(int num){
        if (num==2){System.out.println("2 is a prime number");
    return; 
}
        
        for (int i=2; i<num; i++){
            if(num %i==0){
                System.out.println("it is not a prime no.");
                break;
                
            }
            else{System.out.println("it is a prime no.");
               break; 
               
            }
            
        }
       
}}
