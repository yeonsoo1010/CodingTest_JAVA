import java.util.*;

class Solution {
    public int solution(int[] numbers) {
        // 정렬하면 빠르겠다..
        Arrays.sort(numbers);
        
        int answer = numbers[numbers.length-1] * numbers[numbers.length-2];
        return answer;
    }
}