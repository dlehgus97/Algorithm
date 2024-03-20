class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        boolean[][] check = new boolean[n][n];
        
        int[] dy = {0, 1, 0, -1};
        int[] dx = {1, 0, -1, 0};
        
        int result = 1;
        
        int x = 0;
        int y = 0;
        int dir = 0; 
      
        for(int i = 0 ; i< n * n ; i++){
            answer[y][x] = result;
            check[y][x] = true;
            
            int nx = x + dx[dir];
            int ny = y + dy[dir];
            
             if (nx < 0 || nx >= n || ny < 0 || ny >= n || check[ny][nx]) {
                dir = (dir + 1) % 4;
                nx = x + dx[dir];
                ny = y + dy[dir];
            }
            
            x = nx;
            y = ny;
            result++;
            
        }
        return answer;
    }
}
