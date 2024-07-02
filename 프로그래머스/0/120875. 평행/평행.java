class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        // 3가지 경우 - 하나라도 평행하면 1
        if (angleCalc(0, 1, 2, 3, dots) || angleCalc(0, 2, 1, 3, dots) || angleCalc(0, 3, 1, 2, dots)) {
            answer = 1;
        } else {
            answer = 0;
        }
            
        return answer;
    }
    
    // 기울기 비교 함수 -> boolean 출력
    public boolean angleCalc(int i, int j, int k, int l, int[][] dots) {
        double ang1 = (double) (dots[i][1] - dots[j][1]) / (dots[i][0] - dots[j][0]);
        double ang2 = (double) (dots[k][1] - dots[l][1]) / (dots[k][0] - dots[l][0]);

        return ang1 == ang2;
    }
}