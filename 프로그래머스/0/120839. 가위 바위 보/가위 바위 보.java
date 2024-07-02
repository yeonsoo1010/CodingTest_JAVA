class Solution {
    public String solution(String rsp) {
        String answer = "";
        char ansone = ' ';
        
        for (char tmp : rsp.toCharArray()) {
            if (tmp == '2') { // 가위
                ansone = '0';
            } else if (tmp == '0') { // 바위
                ansone = '5';
            } else if (tmp == '5') { // 보
                ansone = '2';
            }
            answer += ansone;
        }
        
        return answer;
    }
}