class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length/n][n];
        
        // 중첩 for문 (i번째, j번째, k번째...)으로는 얼마나 채워야 하는지 모르므로 X
        // [i][j]로 순서대로 넣어주기
        // ex.[0(몫)][0(나머지)] [0][1] [0][2] [1][0] [1][1] [1][2]
        for (int i=0; i<num_list.length; i++) {
            answer[i/n][i%n] = num_list[i];
        }
            
        return answer;
    }
}