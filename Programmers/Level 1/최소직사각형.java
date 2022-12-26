import java.util.Arrays;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
      
        for(int i = 0; i<sizes.length; i++){
            Arrays.sort(sizes[i]);
            }
      
        int max_1 = 0;
        int max_2 = 0;
      
        for(int i = 0 ; i<sizes.length; i++){
            if(sizes[i][0]>max_1){
                max_1 = sizes[i][0];
            }
            if(sizes[i][1]>max_2){
                max_2 = sizes[i][1];
            }
        }
       answer = max_1 * max_2;
       return answer;
        }      
    }
