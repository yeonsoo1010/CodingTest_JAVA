class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int lr = 0;
        int ud = 0;
        
        for (String k : keyinput) {
            if (k.equals("left")) {
                lr -= 1;
            } else if (k.equals("right")) {
                lr += 1;
            } else if (k.equals("up")) {
                ud += 1;
            } else if (k.equals("down")) {
                ud -= 1;
            }
            
            if (lr >= (board[0]/2)) {
                lr = (board[0]/2);
            } else if (lr <= -(board[0]/2)) {
                lr = -(board[0]/2);
            } 

            if (ud >= (board[1]/2)) {
                ud = (board[1]/2);
            } else if (ud <= -(board[1]/2)) {
                ud = -(board[1]/2);
            }
        }
        
        int[] answer = {lr, ud};
        return answer;
    }
}