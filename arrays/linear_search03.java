package arrays;

/**
 * to find the mak digit inside an array
 */
public class linear_search03 {
    public static void main(String[] args) {
        int rollno[]={2,5,6,7,8,65,68,96};
        findMax(rollno);
    }
    public static void findMax(int arr[]){

        int max =0;
            for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }else continue;

        }System.out.println("the max digit in the array is : "+max);
    }
    
}