import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        int hit = 0;
        int miss = 0;
        
        Deque<String> deque = new LinkedList<>();
        
        
        for (int i=0; i<cities.length; i++) {
            if (cacheSize == 0) {
                miss = cities.length;
                break;
            }
            
            String tmp = cities[i];
            tmp = tmp.toUpperCase();
            
            // 데크의 사이즈는 cacheSize로 고정해야 함. 
            if (!deque.contains(tmp) && deque.size()==cacheSize) { // 없을 때 추가하고 가장 예전 것 삭제
                deque.removeFirst();
                deque.addLast(tmp);
                miss ++;
            } else if (!deque.contains(tmp) && deque.size()<cacheSize) { // 없을 때 추가 (맨 초반 채워넣기)
                deque.addLast(tmp);
                miss ++;
            } else { // 있을 때 그 값을 제거하고 맨 뒤에 채워넣기
                deque.remove(tmp);
                deque.addLast(tmp);
                hit ++;
            }
            
        }
        
        // 계산
        answer = miss * 5 + hit;
        return answer;
    }
}