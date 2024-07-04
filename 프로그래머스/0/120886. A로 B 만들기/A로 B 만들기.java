import java.util.*;

class Solution {
    public int solution(String before, String after) {
        int answer = 0;
        boolean answerBoo = true;
        // 개수가 똑같아야 함 (요소랑 개수가 완벽히 일치해야) -> 해시맵
        
        Map<Character, Integer> counter = new HashMap<>();
        
        for (char b : before.toCharArray()) {
            counter.put(b, counter.getOrDefault(b,0) + 1);
        }
        
        for (char a : after.toCharArray()) {
            counter.put(a, counter.getOrDefault(a,0) - 1);
        }
        
        for (int value : counter.values()) {
            if (value != 0) {
                return 0; // 하나라도 0이 아닌 값이 있으면 0
            } 
        }
       return 1;
    }
}