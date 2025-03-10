package Basics;
import java.util.Scanner;
  

public class max {

 public static void main(String[] args) {

   max_digit();
 }
    static void max_digit(){ 
Scanner sc=new Scanner(System.in);
int a,b,c,max;
System.out.println("enter three numbers: ");
a = sc.nextInt();
b = sc.nextInt();
c = sc.nextInt();

if (a>b){
    max=a;
   
}

else{
    max=b;    
}
if(max>c){
    System.out.println("largest number is: " + max);
}else{
    System.out.println("largest number is: " + c);
    
}

}
}


