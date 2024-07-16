import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int currentWeight = 0;
        int[] bridge = new int[bridge_length];
        
        int index = 0;
        
        while (index < truck_weights.length || currentWeight > 0) {
            answer++;
            
            // 다리에서 트럭을 내림
            currentWeight -= bridge[0];
            
            // 다리 위의 트럭들을 앞으로 한 칸씩 이동
            for (int i = 1; i < bridge_length; i++) {
                bridge[i - 1] = bridge[i];
            }
            bridge[bridge_length - 1] = 0;
            
            // 다음 트럭이 다리에 올라갈 수 있는지 확인
            if (index < truck_weights.length && (currentWeight + truck_weights[index]) <= weight) {
                bridge[bridge_length - 1] = truck_weights[index];
                currentWeight += truck_weights[index];
                index++;
            }
        }
        
        return answer;
    }
}