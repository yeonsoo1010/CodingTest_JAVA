class Solution {
    public int solution(int[] box, int n) {
        
        // 10/3=3, 8/3=2, 6/3=2 다 곱하기
        int answer = (box[0]/n) * (box[1]/n) * (box[2]/n);
        return answer;
    }
}