package slidingWindow.fixedSize;

public class MaximumSumWithGivenSize {

    public static void main(String[] args){
        int[] A ={9,0,1,2,9,8,7,1,4,6};
        solution(A,3);
    }

    public static void solution(int[] A, int K){
        int start=0;
        int end=0;
      //  long[] ans = new long[A.length - K +1];
      //  int index=0;
        long sum=0L;
        long maxSum=Integer.MIN_VALUE;
        while(end<A.length){
            sum += A[end];

            if(end-start+1 == K){
                maxSum = Math.max(maxSum,sum);
                sum -= A[start];
                start++;
            }
            end++;
        }
        System.out.println(maxSum);
    }
}
