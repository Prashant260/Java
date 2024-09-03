//
package mathsForDSA;

import java.util.Scanner;

public class maths09 {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
        System.out.println("enter num1:");
        
        int num1 =sc.nextInt();
        System.out.println("enter num2:");
        int num2 =sc.nextInt();
        euclidianHcf(num1, num2);
        
    }
    public static void euclidianHcf(int num1 ,int num2) {
    
        while (num1!=0&&num2!=0){
            if(num1>num2){
               num1=num1-num2;
               

            }else{
                num2=num2-num1;
            }

        }if(num1>num2){
            System.out.println("gcd is "+num1);
        }else{
            System.out.println("gcd is "+ num2);
        }

    }
}
