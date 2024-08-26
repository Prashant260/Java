import java.util.Scanner;

public class loop{
    public static void main(String[] args) {
        
    

    Scanner sc = new Scanner(System.in);
    int number = sc.nextInt();
      
    for(int i=1; i<5 ; i++){
               number=number/2;
               if(number==0){
                break;
               }
               if(number % 2 == 0){
                continue;
               } 
               System.out.println(number); 
        }
    }


}

