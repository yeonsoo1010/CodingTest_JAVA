class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        // 한 글자씩 찾아서 nk-1번째만
        
        for (int i=code-1; i<cipher.length(); i+=code) {
            answer += cipher.charAt(i);
        }
        return answer;
    }
}