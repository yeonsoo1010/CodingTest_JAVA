import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        
        // int 한글자씩 떼려면, String으로 바꾸기
        String strOrd = String.valueOf(order);
        for (char tmp : strOrd.toCharArray()) {
            if (tmp == '3' || tmp == '6' || tmp == '9') {
                answer ++;
            }
        }
        return answer;
    }
}