package mathsForDSA;

import java.util.Scanner;

public class math04 { 
    public static void main(String[] args) {
        System.out.println("enter a number"); 
        Scanner sc = new Scanner(System.in);
             int num =sc.nextInt(); 
        palindrome(num );
       
    
}
public static void palindrome(int num) {
    
    int copy =num ;
    int  res =0;
     while (num >0){
         
        int  exe=num%10;
        
               res= (int)(res * 10 + exe) ;
               num =num/10;
}
System.out.println(res);
System.out.println(copy);
System.out.println(res == (int)copy);
}

}