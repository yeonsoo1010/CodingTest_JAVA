class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        // my_string값을 하나씩 뽑아서 반복해서 더해주기
        for (int i=0; i<my_string.length(); i++) {
            for (int j=0; j<n; j++) {
                answer += my_string.charAt(i);
            }
        }
        
        return answer;
    }
}