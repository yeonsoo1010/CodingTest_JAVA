import java.util.*;

class Solution {
    boolean[] visited; // 방문한 단어(노드)
    
    public int solution(String begin, String target, String[] words) {
        // 필요한 변수들 정의
        visited = new boolean[words.length]; // visited 초기화
        Queue<String> queue = new ArrayDeque<>(); // 큐
        int answer = 0;
        
        
        queue.add(begin);
        
        while (!queue.isEmpty()) { // 큐가 빌 때까지 반복
            for (int i=0; i<queue.size(); i++) {
                String cur = queue.poll(); // 현재 단어 추출
                // 현재 단어가 목표 단어면 끝나고 지금이 최소 answer
                if (cur.equals(target)) {
                    return answer;
                }
                
                for (int j=0; j<words.length; j++) {
                    if (visited[j] == false && canChange(cur, words[j])) {
                        visited[j] = true;
                        queue.add(words[j]);
                    }
                }
            }
            answer ++;
        }
        return 0;
    }
    
    public boolean canChange(String a, String b) {
        int diffCnt = 0;
        
        for (int i=0; i<a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                diffCnt ++;
            }
        }
        
        if (diffCnt == 1) return true;
        else return false;
    }
}