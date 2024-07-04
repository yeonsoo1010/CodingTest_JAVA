import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        // 해시맵<문자, 개수> -> 나올 때마다 개수 더해주기
        // 개수가 1인 key만 반환해서 answer에 더해주기
        // answer 오름차순 정렬(CharArray)
        
        Map<Character, Integer> counter = new HashMap<>();
        
        for (char letter : s.toCharArray()) {
            counter.put(letter, counter.getOrDefault(letter,0) + 1);
        }
        
        List<Character> onekey = new ArrayList<>();
        
        for (Character key : counter.keySet()) {
            if (counter.get(key) == 1) {
                onekey.add(key);
            }
        }
        
        Collections.sort(onekey);
        for (char o : onekey) {
            answer += o;
        }
        
        return answer;
    }
}