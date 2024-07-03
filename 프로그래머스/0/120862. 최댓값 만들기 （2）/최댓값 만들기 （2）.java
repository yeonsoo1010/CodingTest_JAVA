import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 정렬하는 대신에, 가장 왼쪽 두 수의 곱 vs 가장 오른쪽 두 수의 곱
        Arrays.sort(numbers);
        int len = numbers.length;
        
        int answer = 0;
        if (numbers[0] * numbers[1] > numbers[len-1] * numbers[len-2]) {
            answer = numbers[0] * numbers[1];
        } else {
            answer = numbers[len-1] * numbers[len-2];
        }
        
        return answer;
    }
}