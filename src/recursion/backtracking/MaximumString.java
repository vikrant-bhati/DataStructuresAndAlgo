package recursion.backtracking;


public class MaximumString {
  public static String ans = String.valueOf(Integer.MIN_VALUE);
    public static void main(String[] args){
        String ip = "1714254313 ";
        String out = ip.charAt(0)+"";
        findSolution(ip.substring(1),out,5);
        System.out.println(ans);

    }
    public static void findSolution(String ip, String op, int swaps){
        if(ip.length()==0 || swaps==0){

         //  System.out.println(ip+op+" left swaps: "+swaps + " op is: "+op);
        if(Long.parseLong(ans)<Long.parseLong(op+ip)) {
            ans = op+ip;
        }
        return;
        }

        char temp=ip.charAt(0);
        ip=ip.substring(1);
        if(swaps>=1){
            String op1= max(op,temp);

            if(!op1.equals(op)){
                findSolution(ip, op1, swaps - 1);
            }
        }
        String op2=op+temp;
        findSolution(ip,op2,swaps);


    }

    public static String max(String op, char a){
     //  System.out.println("-----------------------------");
      //  System.out.println();
      //  System.out.print(op+" char: "+a);
        StringBuilder str = new StringBuilder(op);
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)<a){
                char temp=str.charAt(i);
                str.insert(i,a);
                str.deleteCharAt(i+1);
                str.append(temp);
           //     System.out.println(op);
        //        System.out.print("   "+str);
                return str.toString();
            }
        }
        return op;
    }
}
