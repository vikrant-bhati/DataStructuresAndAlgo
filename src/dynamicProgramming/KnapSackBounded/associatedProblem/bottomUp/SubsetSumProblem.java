package dynamicProgramming.KnapSackBounded.associatedProblem.bottomUp;

import java.util.Arrays;

public class SubsetSumProblem {
    public static boolean[][] t;

    public static void main (String[] args) {
        int[] arr = {2, 3, 7, 8, 10};
        int sum = 11;
        int size = 5;
        t = new boolean[size + 1][sum + 1];
        boolean isPresent = subsetSum(arr,sum,size);
        for(boolean[] val: t){
            System.out.println(Arrays.toString(val));
        }
        System.out.println(isPresent);
    }
    public static boolean subsetSum(int[] arr, int sum, int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=sum;j++){
                if(j==0 || i==0) {
                    t[i][j] = (j==0);
                }else{
                    if(arr[i-1] <= j){
                        t[i][j] = (t[i-1][j-arr[i-1]] || t[i-1][j]);
                    }else{
                        t[i][j] = t[i-1][j];
                    }
                }
            }
        }

        return t[n][sum];
    }

}
