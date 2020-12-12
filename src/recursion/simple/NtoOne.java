package recursion.simple;


public class NtoOne {

    public static void main(String[] args){
        solution(10);
    }

    public static void solution(int N){
        if(N==1){
            System.out.print(N+" ");
            return;
        }
        System.out.print(N+" ");
        solution(N-1);
    }
}
