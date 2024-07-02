import java.util.*;

class Solution {
    public int solution(int[][] lines) {
        int answer = 0;
        Map<Integer, Integer> counter = new HashMap<>();
        
        // counter 해시테이블에 모든 범위 저장하기
        // 첫번째 선분 lines[0][0] ~ lines[0][1]까지의 숫자
        for (int i=lines[0][0]; i<lines[0][1]; i++) {
            counter.put(i, counter.getOrDefault(i,0) + 1);
        }
        // 두번째 선분 lines[1][0] ~ lines[1][1]까지의 숫자
        for (int i=lines[1][0]; i<lines[1][1]; i++) {
            counter.put(i, counter.getOrDefault(i,0) + 1);
        }
        // 세번째 선분 lines[2][0] ~ lines[2][1]까지의 숫자
        for (int i=lines[2][0]; i<lines[2][1]; i++) {
            counter.put(i, counter.getOrDefault(i,0) + 1);
        }
        
        // value가 2나 3인 key만 꺼내와서 개수 -1
        for (Integer key : counter.keySet()) {
            if (counter.get(key) == 2 || counter.get(key) == 3) {
                answer += 1;
            }
        }
        
        return (answer);
    }
}