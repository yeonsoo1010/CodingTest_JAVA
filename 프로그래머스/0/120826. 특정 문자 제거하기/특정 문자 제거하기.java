class Solution {
    public String solution(String my_string, String letter) {
        String answer = "";
        
        // letter가 아니면 answer 문자열에 나오게
        String[] tmp = my_string.split(""); // 한글자씩
        
        for (int i=0; i<my_string.length(); i++) {
            if (!(tmp[i].equals(letter))) {
                answer += tmp[i];
            }
        }
        return answer;
    }
}