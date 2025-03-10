

public class searchInString {
 public static void main(String[] args) {
    String str = "prashant";
    searchInString(str);
 }   
 static void searchInString(String str){
    
     char target='t';

    for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == target) {
            System.out.println("yes, at: "+ i );
            
        }
        }
 }
}
