
package mathsForDSA;
import java.util.Scanner;
/**
 * this programme prints all the divisiors of a no.
 */
public class maths05 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number :");
        int num=sc.nextInt();
        divisors(num);
        
    }
     public static void divisors(int num){
        
        for (int i=1; i<=num; i++){
        if(num%i==0){
            System.out.println(i);
        }else{
            continue;
        }


    }
 }
}