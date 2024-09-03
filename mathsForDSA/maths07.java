package mathsForDSA;
import java.util.Scanner;

/**
 *newton raphson method to find a square root

 */
public class maths07 {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        squareRoot(num);
        
    }
    public static void squareRoot(int num){
        double x = num;
        double root;
        double tol =0.001;
     
        while (true){
         root = 0.5*(x+(num/x));
        double ans =x-root; 
        if (ans<tol){
            break;
        }
        x=root;
       
    }
   System.out.println(root);
}
}