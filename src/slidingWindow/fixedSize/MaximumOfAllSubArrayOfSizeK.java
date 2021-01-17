package slidingWindow.fixedSize;

import java.util.*;

public class MaximumOfAllSubArrayOfSizeK {
    public static void main(String[] args){
        //int[] A = {1,3,-1,-3,5,3,6,7};
       // int[] A = {1,1,1,1,1,1,1,1,1,1,1};
        int[] A = {1,-1};
        solution(A,1);
    }

    public static void solution(int[] A, int K){
        Deque<Integer> deque = new LinkedList<>();
        int[] ans = new int[A.length-K+1];
        int start=0;
        int end=0;
        int index=0;
        while(end<A.length){
            int temp = A[end];
            while(!deque.isEmpty() &&  deque.peekLast()<temp){
                deque.pollLast();
            }
            deque.addLast(temp);

            if(end-start+1==K){
                temp=deque.peekFirst();
                ans[index]=temp;
                index++;
                if(A[start]==temp){
                    deque.pollFirst();
                }
                start++;
            }
            end++;
        }
        System.out.println(Arrays.toString(ans));
    }
}
