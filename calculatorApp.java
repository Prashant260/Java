import java.util.Scanner;
 class calculatorApp{

    public static void main(String[] args) {
        
        
     
        System.out.println("enter the operator +, -, *, /, %");
        Scanner sc = new Scanner(System.in);
            String input =sc.next();
            char ch= input.charAt(0);   
        Scanner add = new Scanner(System.in);
        Scanner sub = new Scanner(System.in);

        System.out.println("enter the  digit to perform the operation X =");
            long x = add.nextLong();
        System.out.println("Y=");
            long y = sub.nextLong();

      switch (ch){

        case '+':
            System.out.println("addition");
            System.out.println("addition is "+ x+y);

            break;
        case '-':
            System.out.println("substraction ");
            System.out.println("substraction is "+ (x-y));

            break;
        case '*':
            System.out.println("multiply");
            System.out.println("multiplication  is "+ x*y);

            break;
        case '/':
            System.out.println("division");
            System.out.println("divisiion is "+ (x/y));

            break;
        case '%':
            System.out.println("modulous");
            System.out.println("remainder  is "+ x%y);

            break;
       default:
        System.out.println("wrong input");
            break;
      
            
 }
    
 }
}





 