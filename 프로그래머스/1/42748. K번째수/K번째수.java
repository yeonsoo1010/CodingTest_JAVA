import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        // 인덱스 (b=0인 수-1), (b=1인 수-1)까지로 자르고 오름차순 정렬
        // b=2 -> 인덱스는 (b=2인 수-1)번째
        for (int a=0; a<commands.length; a++) {
            int[] cutCom = Arrays.copyOfRange(array, commands[a][0]-1, commands[a][1]);
            // System.out.println(Arrays.toString(cutCom));
            Arrays.sort(cutCom);
            answer[a] = cutCom[commands[a][2]-1];
        }
        
        return answer;
    }
}