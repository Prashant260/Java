//this is the program toprint the factorial of a number

package mathsForDSA;

import java.util.Scanner;

public class maths11 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int num =sc.nextInt();

        factorial(num);
    }

    public static void factorial(int num) {
        int fact=1;
        for (int i=2;i==num;i++){
        
             fact= fact*i;
             

        }
        System.out.println("factorial of "+num+" is "+fact);
    }
}
