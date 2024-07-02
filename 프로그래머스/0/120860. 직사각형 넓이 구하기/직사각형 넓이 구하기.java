class Solution { 
    public int solution(int[][] dots) {
        
        int xlen = 0;
        int ylen = 0;
        
        if (dots[0][0] != dots[1][0] && dots[1][1] != dots[2][1]) {
            xlen = Math.abs(dots[1][0] - dots[0][0]);
            ylen = Math.abs(dots[2][1] - dots[1][1]);
        }
        
        else if (dots[0][1] != dots[1][1] && dots[1][0] != dots[2][0]) {
            xlen = Math.abs(dots[1][0] - dots[2][0]);
            ylen = Math.abs(dots[0][1] - dots[1][1]);
        }
        
        int answer = xlen * ylen;
        return answer;
    }
}