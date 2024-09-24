import java.util.*;

class Solution {
    public int solution(String dirs) {
        int answer = 0;

        HashSet<String>set = new HashSet<>(); // 이미 방문한곳도 다시 가는거기 떄문에 중복제거 되는 set
        
        //처음 시작 좌표 
        int x = 0; 
        int y = 0;
        
        // 방향을 정해주기 위한 설정
        int[] dx = {0, 0, 1, -1};  
        int[] dy = {1, -1, 0, 0};  
        char[] directions = {'U', 'D', 'R', 'L'};  
        
        for (char dir : dirs.toCharArray()) {
            int way = 0; // 방향
            
            //방향을 찾기 위한 반복문 
            for (int i = 0; i < directions.length; i++) {
                if (dir == directions[i]) {
                    way = i;
                    break;
                }
            }
            
            //도착지 
            int nx = x + dx[way];  
            int ny = y + dy[way];  
            
            // 단, 좌표평면의 경계를 넘어가는 명령어는 무시합니다. 조건 성립하기 위해 
            if (nx >= -5 && nx <= 5 && ny >= -5 && ny <= 5) {
                
                //처음에 Integer로 하다가 고생했는데 이렇게 2개로 해야한다 
                //path1  출발점 -> 도착점 / path2 도착점 -> 출발점   (양방향이라는걸 생각해야함)
                String path1 = x + "," + y + "," + nx + "," + ny;  
                String path2 = nx + "," + ny + "," + x + "," + y;  
                
                System.out.println(path1);
                System.out.println(path2);
                
                set.add(path1);
                set.add(path2);
                
                //도착지가 새로운 좌표 
                x = nx;
                y = ny;
            }
        }
        //양방향으로 했기때문에 2로 나워줘야함 
        return set.size() / 2;
    }
}
