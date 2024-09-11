import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        List<int[]> divisor = new ArrayList<>();
        
        // 나눠떨어지는 약수 찾기
        // 중복 없이 넣기 (중간까지만?)
        // 안되네 중복 있게 하고 나중에 처리하는 게 나을 거 같음
        for (int i=1; i*i<=yellow; i++) {
            if (yellow % i == 0) {
                divisor.add(new int[]{i, yellow/i});
            }
            else continue;
        }
        
        // System.out.println(divisor); -> 요소 출력이 안됨
        for (int[] tmpArray : divisor) {
            System.out.println(Arrays.toString(tmpArray));
        }
        
        
        // 갈색 격자 수로 체크하기
        for (int[] tmpY : divisor) {
            int yellowSero = tmpY[0]; // 짧은 게 노란 세로
            int yellowGaro = tmpY[1]; // 긴 게 노란 가로
            if (brown == (2*(yellowSero + yellowGaro) + 4)) {
                answer = new int[]{yellowGaro +2, yellowSero +2};
            }
            else continue;
        }
        

        return answer;
    }
}