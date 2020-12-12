package recursion.simple;

import java.util.Arrays;
import java.util.Stack;

public class DeleteMiddleElementStack {

    public static void main(String[] args){
        Integer[] arr= {9,0,1,2,9,8,7,1,4,6};
        int K=(arr.length/2) + 1;
     //   System.out.println(K);
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
        if(stack.isEmpty()){
            System.out.println(stack);
            return;
        }
        removeElement(stack,K);
        System.out.println(stack);
    }

    public static void removeElement(Stack<Integer> stack , int K){
 //       System.out.println(K + " " +stack.peek());
        if(K==1){
            stack.pop();
            return;
        }
        int temp=stack.pop();
        removeElement(stack,K-1);
        stack.push(temp);
    }
}
