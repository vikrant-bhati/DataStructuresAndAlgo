package dynamicProgramming.KnapSackBounded;

import java.util.Arrays;

public class BottomUpDP {
    public static int[][] t;

    public static void main (String[] args){
        int[] weight = {1, 3, 4, 5};
        int[] price = {1, 4, 5, 7};
        int capacity = 7;
        int size = 4;
        t = new int[size+1][capacity+1];

        int profit = knapsack(weight,price,capacity,size);
        for(int[] val : t){
            System.out.println(Arrays.toString(val));
        }

        System.out.println("Maximum Profit is: "+ profit);

    }

    public static int knapsack(int[] weight, int[] value, int w, int n){
        for(int i=0;i<=n;i++){
            for(int j=0;j<=w;j++){
                if(i==0 || j==0){
                    t[i][j] = 0;
                }else{
                    if(weight[i-1] <= j){
                        t[i][j] = Math.max(value[i-1]+t[i-1][j-weight[i-1]],t[n-1][j]);
                    }else{
                        t[i][j] = t[n-1][j];
                    }
                }
            }
        }
        return t[n][w];
    }
}
