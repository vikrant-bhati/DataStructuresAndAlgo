package recursion.simple;

import java.util.Arrays;
import java.util.Stack;

public class SortingTheStack {

    public static void main(String[] args){
        Integer[] arr = {9,0,1,2,9,8,7,1,4,6};
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
        sorting(stack);
        System.out.println(stack);
    }

    public static void sorting(Stack<Integer> stack){
        if(stack.isEmpty()){
            return;
        }
        int temp=stack.pop();
        sorting(stack);
        insertion(stack,temp);
    }

    public static void insertion(Stack<Integer> stack, int temp){
        if(stack.isEmpty() || stack.peek()<=temp){
            stack.push(temp);
            return;
        }
        int temp1=stack.pop();
        insertion(stack,temp);
        stack.push(temp1);
    }
}
