package dynamicProgramming.KnapSackBounded.associatedProblem.recurssion;

public class SubsetSumProblemRecursion {

    public static void main (String[] args){
        int[] arr = {2,3,7,8,10};
        int sum=14;
        int size=5;
        boolean isPresent = subsetSum(arr,sum,size);
        System.out.println(isPresent);
    }

    public static boolean subsetSum(int[] arr, int sum, int n){
        if(sum==0 || n==0){
            return sum == 0;
        }

        if(arr[n-1] <=sum){
           return  (subsetSum(arr,sum-arr[n-1],n-1)||subsetSum(arr,sum,n-1));
        }else{
          return   subsetSum(arr,sum,n-1);
        }
    }
}
