class Solution {
    boolean[] visited; // 방문한 노드
    
    public int solution(int n, int[][] computers) { // 노드: n개, 간선: computers
        int answer = 0;
        visited = new boolean[n]; // 방문 배열 초기화
        
        for (int i=0; i<n; i++) {
            if (visited[i]) continue;
            dfs(i, n, computers); // 방문하지 않은 노드에 대해서 dfs 들어가기
            answer ++;
        }
        
        return answer;
    }
    
    public void dfs(int start, int n, int[][] computers) { 
        visited[start] = true;
        
        for (int i=0; i<n; i++) {
            if (computers[start][i] == 1 && visited[i] == false) { // 연결되어 있으면서 방문하지 않은 노드
                dfs(i, n, computers);
            }
        }
    }
}