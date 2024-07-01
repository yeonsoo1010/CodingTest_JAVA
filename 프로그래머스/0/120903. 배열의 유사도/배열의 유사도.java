class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;
        
        for (String ones1 : s1) {
            for (String ones2 : s2) {
                if (ones1.equals(ones2)) {
                    answer += 1;
                }
            }
        }
        
        return answer;
    }
}