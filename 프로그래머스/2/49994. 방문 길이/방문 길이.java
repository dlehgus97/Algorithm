import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;

        HashSet<String>set = new HashSet<>();
        
        int x = 0;
        int y = 0;
        
        int[] dx = {0, 0, 1, -1};  
        int[] dy = {1, -1, 0, 0};  
        char[] directions = {'U', 'D', 'R', 'L'};  
        
        for (char dir : dirs.toCharArray()) {
            int way = 0;
            
            for (int i = 0; i < directions.length; i++) {
                if (dir == directions[i]) {
                    way = i;
                    break;
                }
            }
            
            int nx = x + dx[way];  
            int ny = y + dy[way];  
            
            if (nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5) {
                
                String path1 = x + "," + y + "," + nx + "," + ny;  
                String path2 = nx + "," + ny + "," + x + "," + y;  
                
                System.out.println(path1);
                System.out.println(path2);
                
                set.add(path1);
                set.add(path2);
                
                x = nx;
                y = ny;
            }
        }
        return set.size() / 2;
    }
}
