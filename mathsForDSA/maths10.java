package mathsForDSA;

import java.util.Scanner;

public class maths10 {
    public static void main(String[] args) {
          Scanner sc =new Scanner(System.in);
        System.out.println("enter num1:");
        
        int num1 =sc.nextInt();
        System.out.println("enter num2:");
        int num2 =sc.nextInt();
        lcm(num1, num2);
    }
    public static void lcm(int num1 ,int num2) {
        int multi=num1*num2;
        while (num1!=0&&num2!=0){
            if(num1>num2){
               num1=num1-num2;
               

            }else{
                num2=num2-num1;
            }

        }if(num1>num2){
            int res=multi/num1;
            System.out.println(res);
           
        }else{
           int res=multi/num2;
           System.out.println(res);
        }

  
    }
}
