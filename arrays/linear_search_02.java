    package arrays;
    import java.util.Scanner;
    
    /**
     * to search the multiple occurance of target number
     */
    public class linear_search_02 {
        public static void main(String[] args) {
        


    int pump[]={1,2,7,5,4,7,8,9}; 
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the target number");
    int num =sc.nextInt();
    findTarget(num, pump);
    }
public static void findTarget(int target, int arr[]){
    int ans[] = new int[arr.length];
    int k = 0;
    for (int i=0;i<arr.length;i++){
        if(arr[i]==target){
            ans[k] = i ;
            k++;       
    }
}

    if (k==0){
        System.out.println("target not found");
       
}   else{
      for (int i=0 ;i<ans.length;i++){
        System.out.println("found element at pos: "+ ans[i] );

    }
  }
 }
}
