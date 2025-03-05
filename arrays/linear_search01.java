package arrays;


import  java.util.Scanner;
public class linear_search01 {
//this program shows how to find any element by binary search

    public static void main(String[] args) {
    int pump[]={1,2,6,5,4,7,8,9}; 
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the target number");
    int num =sc.nextInt();
    findTarget(num, pump);
    }
public static void findTarget(int target, int arr[]){
    int ans =-1;
for (int i=0;i<arr.length;i++){
    if(arr[i]==target){
        ans = target;
        System.out.println(target + " is at index no."+i);
        break;
    }else {continue;
}
}if (ans==-1){
    System.out.println("target not found");
}

}


}
