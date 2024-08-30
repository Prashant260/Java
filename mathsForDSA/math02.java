/*this program shows us the power of 10 
can be used to get the given number*/
package mathsForDSA;

import java.util.Scanner;

public class math02 {

  
        public static void main(String[] args) {
        System.out.println("enter a number"); 
        Scanner sc = new Scanner(System.in);
             double num =sc.nextDouble(); 
        countDigitsViaLog(num);
        
    }
    public static void countDigitsViaLog(double num){
      int count = (int)(Math.log(num) / Math.log(10) + 1);

        System.out.println("the poewer of 10 is: "+ count);

    }
    
}
