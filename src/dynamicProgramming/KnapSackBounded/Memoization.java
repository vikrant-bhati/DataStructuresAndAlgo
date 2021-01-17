package dynamicProgramming.KnapSackBounded;

import java.util.Arrays;

public class Memoization {
    public static int[][] t;

    public static void main (String[] args){
        int[] weight = {1, 3, 4, 5};
        int[] price = {1, 4, 5, 7};
        int capacity = 7;
        int size = 4;
        t = new int[size+1][capacity+1];
        for(int[] val : t){
            Arrays.fill(val,-1);
        }

        int profit = knapsack(weight,price,capacity,size);
        for(int[] val : t){
            System.out.println(Arrays.toString(val));
        }

        System.out.println("Maximum Profit is: "+ profit);

    }

    public static int knapsack(int[] weight, int[] value, int w, int n){
        if(t[n][w] != -1){
            return t[n][w];
        }
        if(n==0 || w==0){
            return 0;
        }
        if(weight[n-1] <= w){
            t[n][w] = Math.max(value[n-1]+knapsack(weight, value, w-weight[n-1],n-1),knapsack(weight, value, w,n-1));
        }else{
            t[n][w] = knapsack(weight, value, w,n-1);
        }
        return t[n][w];
    }
}
