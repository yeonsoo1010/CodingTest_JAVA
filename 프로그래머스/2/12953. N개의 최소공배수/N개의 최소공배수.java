class Solution {
    public int solution(int[] arr) {
        return getLCM(arr);
    }
    
    public int getLCM(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        
        int gcd = getGCD(arr[0], arr[1]);
        // int lcm = gcd * arr[0]/gcd * arr[1]/gcd;
        // 계산하면 이러함
        int lcm = arr[0] * arr[1] / gcd;
        
        // 이전 계산한 최소공배수에 다시 최소공배수 구하기
        for (int i = 2; i < arr.length; i++) {
            gcd = getGCD(lcm, arr[i]);
            lcm = lcm * arr[i] / gcd;
        }
        
        return lcm;
    }
    
    
    public int getGCD(int num1, int num2) {
        if (num1 % num2 == 0) { //큰수가 작은수로 나눠떨어지면 작은 수가 큰수의 최대공약수 (ex. 8, 2)
            return num2;
        }
        // 안나눠떨어지면
        // 나눴던 수에 이전 나머지를 나눠서 다시 나눠떨어지는지 확인하기 -> 재귀
        return getGCD(num2, num1 % num2);
    }
}