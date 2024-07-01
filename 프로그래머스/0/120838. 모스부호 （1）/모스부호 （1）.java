class Solution {
    public String solution(String letter) {
        String answer = "";
        
        // 해쉬맵 이용-일일이 put 불편 & split으로 공백 기준 한 글자씩 끊어보기
        String[] morse = {".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..","--","-.",
                "---",".--.","--.-",".-.","...","-","..-","...-",
                ".--","-..-","-.--","--.."};
        String[] oneMorse = letter.split(" ");
        
        for (String m : oneMorse) {
            for (int i=0; i<morse.length; i++) {
                if (m.equals(morse[i])) {
                    // i번째(정확히는 i+1번째) 알파벳: 1번째 - 97
                    char oneletter = (char) (i+97);
                    answer += oneletter;
                }
            }
        }
        // char chara = 'a';
        // int inta = (int) chara;
        // System.out.println(inta); // 97
        
        // char charb = 'b';
        // int intb = (int) charb;
        // System.out.println(intb); // 98
        
        return answer;
    }
}