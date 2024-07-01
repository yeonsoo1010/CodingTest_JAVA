class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for (int i=0; i<my_string.length(); i++) {
            char letter = my_string.charAt(i);
            if (letter < 97) { // 대문자
                letter += 32;
            } else {
                letter -= 32;
            }
            answer += letter;
        }
        
        //char charA = 'A';
        //int intA = (int) charA;
        //System.out.println(intA); //65 소문자는 97
        return answer;
    }
}