package recursion.simple;

import java.util.Arrays;
import java.util.Stack;

public class ReversingStackUsingRecursion {

    public static void main(String[] args){
        Integer[] arr= {9,0,1,2,9,8,7,1,4,6};
   //     int size=arr.length;
        Stack<Integer> stack = new Stack<>();
        stack.addAll(Arrays.asList(arr));
        System.out.println(stack);
        reverse(stack);
    //    reverse(stack,size);
        System.out.println(stack);
    }
    //Better approach

    public static void reverse(Stack<Integer> stack){
        if(stack.size()<=1){
            return;
        }
        int temp=stack.pop();
        reverse(stack);
        insertion(stack,temp);

    }

    public static void insertion(Stack<Integer> stack, int val){
        if(stack.isEmpty()){
            stack.push(val);
            return;
        }
        int pop = stack.pop();
        insertion(stack,val);
        stack.push(pop);
    }

   /* public static void reverse(Stack<Integer> stack, int size){
        if(size==1){
            return;
        }
        int temp = stack.pop();
        insertion(stack,size-1, temp);
        reverse(stack,size-1);
    }*/

 /*   public static void insertion(Stack<Integer> stack, int size, int val){
        if(size==0){
            stack.push(val);
            return;
        }

        int temp=stack.pop();
        insertion(stack,size-1,val);
        stack.push(temp);
    }*/
}
