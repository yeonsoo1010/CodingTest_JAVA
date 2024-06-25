class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int[] num = new int[2];
        
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            String ctostr = "" + c;
            
            if (ctostr.equalsIgnoreCase("p")) {
                num[0] += 1;
            } else if (ctostr.equalsIgnoreCase("y")) {
                num[1] += 1;
            }
        }
        
        // 확인
        System.out.println("p의 개수:" + num[0] + ", y의 개수: " + num[1]);
        
        if (num[0] == num[1]) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}