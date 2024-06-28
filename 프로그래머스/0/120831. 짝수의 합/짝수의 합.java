class Solution {
    public int solution(int n) {
        
        // 짝수이면 더하고 홀수이면 넘어가기
        int answer = 0;
        
        for (int i=2; i<=n; i=i+2) {
            answer += i;
        }
        
        return answer;
    }
}