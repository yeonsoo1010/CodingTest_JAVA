import java.util.*;

class Solution {
    public String solution(int age) {
        String answer = "";
        
        // a의 아스키코드: 97
        // age의 숫자 하나 + 47 -> 행성 숫자
        // age -> String -> char로 하나씩 -> 47 더해서 이어붙이기
        String strAge = String.valueOf(age); // String age
        for (char tmp : strAge.toCharArray()) {
            // System.out.println(tmp);
            char oneAns = (char)(tmp - '0' + 97);
            // System.out.println(oneAns);
            answer += oneAns;
        }
        
        return answer;
    }
}