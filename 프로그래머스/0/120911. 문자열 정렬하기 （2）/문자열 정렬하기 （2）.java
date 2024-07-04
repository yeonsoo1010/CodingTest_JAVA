import java.util.*;

class Solution {
    public String solution(String my_string) {
        my_string = my_string.toLowerCase();
        
        char[] strArr = my_string.toCharArray();
        Arrays.sort(strArr);
        
        String answer = new String(strArr);
        return answer;
    }
}