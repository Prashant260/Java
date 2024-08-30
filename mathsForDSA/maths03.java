/*this is the program to check weater a number is a armsrong
 * number or not  */

 /*armstron number is a number wher the sum of the cube of each digit 
  * is results as the given number then the number is a armstrog number 
   */
package mathsForDSA;

import java.util.Scanner;

public class maths03 {
    public static void main(String[] args) {       
    System.out.println("enter a number"); 
    Scanner sc = new Scanner(System.in);
    int num =sc.nextInt(); 
    armstrogNumber(num);
    
    
    }
public static void  armstrogNumber(int num){
    int results=0;
    int copy = num;
    while(num >0){
        int ext = num%10;
        int cube =(int) Math.pow(ext, 3);

        
         results = results + cube; 
         num/=10;   
                 
        }
        
        System.out.println(results== copy);
    } 
    
  
}

