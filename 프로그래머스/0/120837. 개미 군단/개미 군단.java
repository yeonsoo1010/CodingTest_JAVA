class Solution {
    public int solution(int hp) {
        int answer = 0;
        // 장군개미, 병정개미, 일개미 순으로 많도록
        // 23 % 5 = 3 -> 3 % 3 = 0 -> 일개미 없음, 장군개미와 병정개미의 몫
        // 24 % 5 = 4 -> 4 % 3 = 1 -> 모두 필요
        int rest1 = hp % 5; // 3
        int rest2 = rest1 % 3; // 0
        answer = (hp/5) + (rest1/3) + rest2;
        
        return answer;
    }
}