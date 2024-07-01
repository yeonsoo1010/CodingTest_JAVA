import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int[] solution(String[] strlist) {
        int[] answer = {};
        // 배열 -> 리스트
        // List<Integer> answerList = new ArrayList<> (Arrays.asList(answer));
        List<Integer> answerList = Arrays.stream(answer)
            .boxed()
            .collect(Collectors.toList());
        
        for (String oneStr : strlist) {
            int length = oneStr.length();
            answerList.add(length);
        }
        System.out.println(answerList);
        
        // 리스트 -> 배열
        // List<Integer>를 int[]로 변환
        answer = answerList.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}