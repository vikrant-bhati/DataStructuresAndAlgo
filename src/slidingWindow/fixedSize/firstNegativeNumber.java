package slidingWindow.fixedSize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class firstNegativeNumber {

    public static void main(String[] args){
        int[] A = {1,-2,3,-3,4,5,-6};
        solution(A,3);
    }

    public static void solution(int[] A, int K){
        int start=0;
        int end=0;
        int[] ans = new int[A.length-K+1];
        int index=0;
        List<Integer> list = new ArrayList<>();
        while(end<A.length){
            if(A[end]<0){
                list.add(A[end]);
            }
            if(end-start+1==K){
                if(!list.isEmpty()){
                    ans[index]=list.get(0);
                }

                if(A[start]<0){
                    list.remove(0);
                }
                start++;
                index++;
            }
            end++;
        }

        System.out.println(Arrays.toString(ans));
    }
}
