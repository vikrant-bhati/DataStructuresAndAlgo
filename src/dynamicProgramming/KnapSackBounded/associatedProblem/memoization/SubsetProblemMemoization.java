package dynamicProgramming.KnapSackBounded.associatedProblem.memoization;

import java.util.Arrays;

public class SubsetProblemMemoization {
    public static int[][] t;

    public static void main (String[] args){
        int[] arr = {2,3,7,8,10};
        int sum=11;
        int size=5;
        t = new int[size+1][sum+1];
        for(int[] val : t){
            Arrays.fill(val,-1);
        }
        boolean isPresent = subsetSum(arr,sum,size);

        for(int[] val:t){
            System.out.println(Arrays.toString(val));
        }
        System.out.println(isPresent);
    }

    public static boolean subsetSum(int[] arr, int sum, int n){
        if(t[n][sum]!=-1){
            return t[n][sum] != 0;
        }
       if(n==0 || sum==0){
           return sum==0 ;
       }

       if(arr[n-1] <= sum){
           t[n][sum] = (subsetSum(arr,sum-arr[n-1],n-1) || subsetSum(arr,sum,n-1)) ? 1:0;
       }else{
           t[n][sum] = subsetSum(arr,sum,n-1) ? 1:0 ;
       }
       return (t[n][sum] != 0);
    }
}
