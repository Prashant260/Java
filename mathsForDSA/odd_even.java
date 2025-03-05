package mathsForDSA;

public class odd_even {

  public static void main(String[] args, int Num) {
      System.out.println("enter a digit: ");
      oddEvenCheck(Num);
  }
  static void oddEvenCheck(int a){
       if (a%2==0){
        System.out.println(a+ "is an even number");
       }
       else{
        System.out.println(a + "is an odd number");
       }
    



  }
    
}
