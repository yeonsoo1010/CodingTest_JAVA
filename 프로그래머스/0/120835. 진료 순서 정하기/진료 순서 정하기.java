import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        // emergency 복사 버전(sortedEme) 만들어놓기
        // sortedEme: 정렬(내림차순) 76 24 3
        // emergency에 반복문 -> 3이면 indexof sortedEme=3, 76이면 indexof sortedEme=1,..
        
        Integer[] sortedEme = Arrays.stream(emergency)
            .boxed()
            .toArray(Integer[]::new);
        Arrays.sort(sortedEme, Collections.reverseOrder());
        
        for (int i=0; i<emergency.length; i++) {
            answer[i] = Arrays.asList(sortedEme).indexOf(emergency[i]) + 1;
        }
        
        return answer;
    }
}