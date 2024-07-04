class Solution {
    public int solution(int num, int k) {
               
        // num을 돌면서 있으면 (1부터 더해지는 수), 없으면 -1
        String strNum = num + ""; // String으로 바뀜
        int answer = 0;
        int count = 0;
        
        for (int i=0; i<strNum.length(); i++) {
            
            if (strNum.charAt(i) == (char)(k +'0')) {
                count += 1;
                break;
            } else {
                count += 1;
            }
            System.out.println("i: " + i);
            System.out.println("strNum.charAt(i): "+ strNum.charAt(i));
            System.out.println("(char)(k+'0'): " + (char)(k+'0'));
            System.out.println("count: " + count);
            System.out.println("------");
        }
        
        answer = count;
        
        if (count == strNum.length()) {
            answer = -1;
        } 
        if (strNum.charAt(strNum.length()-1) == (char)(k+'0')) {
            System.out.println("마지막 수: " + strNum.charAt(strNum.length()-1));
            System.out.println("k:" + (char)(k+'0'));
            answer = count;
        }

        
        
        return answer;
    }
}