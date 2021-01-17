package recursion.simple;
//https://leetcode.com/problems/k-th-symbol-in-grammar/
public class KthSymbolInGrammer {
    public static void main(String[] args){
        int n=2;
        int k=2;
        System.out.println(solution(n,k));
    }
    public static int solution(int n, int k){
        if(n==1 && k==1){
            return 0;
        }

        int mid=(int)(Math.pow(2,n-1))/2;
        if(k<=mid){
            return solution(n-1,k);
        }else{
            int val = solution(n-1,k-mid);
            if(val==0){
                return  1;
            }else{
                return 0;
            }
        }
    }
}
