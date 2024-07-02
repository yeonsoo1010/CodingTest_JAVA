class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int totalN = numer1*denom2 + numer2*denom1;
        int totalD = denom1*denom2;
        
        int gcd = getGCD(totalN, totalD);
        
        int[] answer = {totalN/gcd, totalD/gcd};
        return answer;
    }
    
    public static int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) {
            return num2;
        }
        return getGCD(num2, num1%num2); // 이 부분을 생각 못함 .... 
    }
}