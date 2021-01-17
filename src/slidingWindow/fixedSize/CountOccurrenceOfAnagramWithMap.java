package slidingWindow.fixedSize;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrenceOfAnagramWithMap {

    public static void main(String[] args){
        solution("AAAAABAA","AABA");
    }

    public static void solution(String A, String B){
        Map<Character, Integer> map = new HashMap<>();
        for(int i=0;i<B.length();i++){
            char temp = B.charAt(i);
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }
        int count=map.size();
        int end=0;
        int start=0;
        int ans=0;
        int size = A.length();
        while(end<size){
            char temp = A.charAt(end);
            if(map.containsKey(temp)){
                int val = map.get(temp);
                if(val==1){
                    count--;
                }
                map.put(temp,val-1);
            }

            if(end-start+1 == B.length()){
                if(count==0){
                    ans++;
                }
                temp=A.charAt(start);
                if(map.containsKey(temp)){
                    int val = map.get(temp);
                    if(val==0){
                        count++;
                    }
                    map.put(temp,val+1);
                }
                start++;
            }
            end++;
        }

        System.out.println(ans);
    }
}
