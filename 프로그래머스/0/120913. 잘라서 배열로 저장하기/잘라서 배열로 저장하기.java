import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> answerList = new ArrayList<>();
        
        // 길이: 10, i=0,3,6,9 / 012 345 678 9
        for (int i=0; i<my_str.length(); i+=n) {
            if (i+n > my_str.length()) {
                String sub = my_str.substring(i);
                answerList.add(sub);
            } else {
                String sub = my_str.substring(i, i+n);
                answerList.add(sub);
            }
            // answerList.add(sub);
            
        }
        
        String[] answer = answerList.toArray(new String[0]);
        return answer;
    }
}