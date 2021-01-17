package slidingWindow.fixedSize;

//Not this is not working
public class CountOccurrenceOfAnagramsWithStringBuilder {
    public static void main(String[] args){
        solution("AABAABAA","AABA");
    }
    public static void solution(String A, String B){
        StringBuilder str= new StringBuilder(B);
        int start=0;
        int end=0;
        int size = A.length();
        int count=0;
        while(end<size){
            char temp = A.charAt(end);
            int index= str.indexOf(temp+"");
            if(index!=-1){
                str.deleteCharAt(index);
            }

            if(end-start+1 == B.length()){
                if(str.length()==0){
                    count++;
                }
                temp = A.charAt(start);
                if(B.indexOf(temp)!=-1){
                    str.append(temp);
                }
                start++;
            }
            end++;
        }
        System.out.println(count);
    }
}
