package dynamicProgramming.KnapSackBounded;

public class RecursiveSolution {
    
    public static void main(String[] args){
        int[] weight = {9,0,1,2,9,8,7,1,4,6};
        int[] price = {9,9,2,7,5,1,4,6};
        int capacity = 18;
        int size = 4;
        long start = System.currentTimeMillis();
        int maxProfit = knapsack(weight, price, capacity, size);
        long end = System.currentTimeMillis();
        System.out.println("Time taken is: "+(end-start));
        System.out.println("Max Profit is: "+maxProfit);
    }
    
    public static int knapsack(int[] weight, int[] price, int w, int n){
        if(w==0 || n==0){
            return 0;
        }
        if(weight[n-1] <= w){
            return Math.max(price[n-1] + knapsack(weight, price, w- weight[n-1], n-1),knapsack(weight, price, w, n-1));
        }else{
            return knapsack(weight, price, w, n-1);
        }
    }
}
