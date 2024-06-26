import java.util.*;

class Solution {
    public int solution(int[] array) {
           
        // 오름차순
        Arrays.sort(array);
        
        int i = (array.length -1) / 2 ;
        int answer = array[i];
        
        return answer;
    }
}