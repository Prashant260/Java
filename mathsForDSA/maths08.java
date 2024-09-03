package mathsForDSA;
// this program helps us to find the hcf of two numbers

import java.util.Scanner;

public class maths08 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter num1:");
        
        int num1 =sc.nextInt();
        System.out.println("enter num2:");
        int num2 =sc.nextInt();
         findHcf(num1 , num2);

    }
    public static void  findHcf(int num1 , int num2){
        int ans=0;
        for(int i =1; i <= num1; i++){
            if (num1%i==0 && num2%i== 0){
                ans= i;

            } 
        }System.out.println(ans);


    }
}
