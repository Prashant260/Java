package mathsForDSA;
//this program is used to count the total no. of digits in the given number.



import java.util.Scanner;

public class maths01 {
    public static void main(String[] args) {
        System.out.println("enter a number"); 
        Scanner sc = new Scanner(System.in);
             long num =sc.nextLong();   
          countDigit(num);      
}
public static void countDigit(long num){   

    int counter =0;
    if (num == 0){
        System.out.println("the number of digit is : 1 ");
        return;}
    

    while(num >0){
        num /=10;
        counter++;

    }
    System.out.println("the number of digits are :"+ counter);
}
}
