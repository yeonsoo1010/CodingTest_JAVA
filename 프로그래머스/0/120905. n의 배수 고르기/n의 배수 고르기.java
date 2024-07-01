import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answerList = new ArrayList<>();
        
        // n의 배수가 아닌 수를 제거 -> n의 배수만 배열로 담기
        for (int tmp : numlist) {
            if (tmp % n == 0) {
                answerList.add(tmp);
            }
        }
        
        int[] answer = answerList.stream()
            .mapToInt(Integer::intValue)
            .toArray();
        return answer;
    }
}