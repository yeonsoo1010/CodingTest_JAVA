import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        
        String nStr = String.valueOf(n);
        // System.out.println(nStr); // ok
        
        for (char onenum : nStr.toCharArray()) {
            //System.out.println(onenum);
            int onenumInt = onenum - '0';
            //System.out.println(onenumInt);
            answer += onenumInt;
        }
        return answer;
    }
}