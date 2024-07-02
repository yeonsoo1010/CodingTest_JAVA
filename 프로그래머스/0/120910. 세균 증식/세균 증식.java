class Solution {
    public int solution(int n, int t) {
        double square = Math.pow(2, t);
        int answer = n * (int)square;
        return answer;
    }
}