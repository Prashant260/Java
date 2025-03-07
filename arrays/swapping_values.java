package arrays;

import java.util.Arrays;

class swapping_values {
    public static void main(String[] args) {
        
        int arr[]={1,2,3,3,5,6,4,6};
        System.out.println(Arrays.toString(arr));
        swapping_values(arr, 1,4);
    }
static void swapping_values(int [] arr,int i,int j){
    int temp=arr[i];
    arr[i] =arr[j];
    arr[j]=temp;
System.out.println(Arrays.toString(arr));
}
    
}