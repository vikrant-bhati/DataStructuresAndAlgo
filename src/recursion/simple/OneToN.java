package recursion.simple;

public class OneToN {

    public static void main(String[] args){
        solution(10);
    }
    public static void solution(int N){
        if(N==1){
            System.out.print(N+" ");
            return;
        }
        solution(N-1);
        System.out.print(N+" ");
    }
}
