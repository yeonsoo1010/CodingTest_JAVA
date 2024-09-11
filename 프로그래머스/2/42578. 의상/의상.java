import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        
        Map<String, List<String>> map = new HashMap<>();
        // 종류 - [옷1, 옷2]
        
        for (String[] cloth : clothes) {
            map.put(cloth[1], new ArrayList()); // 겹치면 제외해야 함
            
        }
        
        for (String[] cloth : clothes) {
            map.get(cloth[1]).add(cloth[0]);
        }
        
        
        // 출력해보기
        // Map의 모든 요소 출력
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            List<String> valueList = entry.getValue();
            
            System.out.println("Key: " + key);
            System.out.println("Values: " + valueList);  // List 자체를 출력
            System.out.println("------------");
        }
        
        
        
        for (String type : map.keySet()) {
            List<String> values = map.get(type);
            int num = values.size(); // 밸류인 리스트 사이즈
            answer *= (num + 1);
        }
        answer = answer - 1; // 모두 안입은 경우 제외
        
        return answer;
    }
}