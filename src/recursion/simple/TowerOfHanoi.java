package recursion.simple;

public class TowerOfHanoi {
    public static void main(String[] args){
       String s = "Source";
       String d = "Destination";
       String h = "Helper";
       int n=5;
        solution(s,d,h,n);
    }
    public static void solution(String s, String d, String h, int n){
        if(n==1){
            System.out.println("Transfer Plate No: "+n+" from "+s+" to "+d);
            return;
        }
        solution(s,h,d,n-1);
        System.out.println("Transfer Plate No: "+n+" from "+s+" to "+d);
        solution(h,d,s,n-1);
    }
}
