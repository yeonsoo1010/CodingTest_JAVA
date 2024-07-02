import java.util.*;

class Solution {
    public int solution(int[] sides) {
        int max = Arrays.stream(sides).max().getAsInt();
        int sum = Arrays.stream(sides).sum();
        
        int answer = (max < (sum-max)) ? 1 : 2;
        
        return answer;
    }
}