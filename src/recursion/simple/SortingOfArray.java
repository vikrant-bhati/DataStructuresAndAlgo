package recursion.simple;

import java.util.Arrays;

public class SortingOfArray {

    public static void main(String[] args){
        int[] arr = {9,0,1,2,9,8,7,1,4,6};
        sorting(arr,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void sorting(int[] arr, int size){
        if(size==0){
            return;
        }
        int temp=arr[size-1];
        sorting(arr,size-1);
        inserting(arr,size-1,temp);

    }

    public static void inserting(int[] arr, int size, int temp){
        if(size==0 || arr[size-1]<=temp){
            arr[size]=temp;
            return;
        }
        int temp2=arr[size-1];
        inserting(arr,size-1,temp);
        arr[size]=temp2;
    }
}
