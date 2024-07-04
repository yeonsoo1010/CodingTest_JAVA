import java.util.*;

class Solution {
    public int[] solution(int n) {
        // 크기를 모르니까 리스트로...
        List<Integer> answerList = new ArrayList<>();
        
        // n보다 작은 값을 모두 반복문 돌림 -> 나눠떨어지는 것만 result에
        for (int i=1; i<=n; i++) {
            if (n % i == 0) {
                answerList.add(i);
            }
        }
        int[] answer = answerList.stream()
            .mapToInt(i -> i.intValue())
            .toArray();
        return answer;
    }
}