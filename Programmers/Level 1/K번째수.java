import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
        for(int i = 0 ;i<commands.length; i++){
                 int one = commands[i][0];
                 int two = commands[i][1];
                 int three = commands[i][2];

                 int[] tmp = new int[two - one + 1];

                for (int j = 0; j <= two - one ; j++) {
                    tmp[j] = array[one - 1 + j];
 
                }

                Arrays.sort(tmp);
                answer[i] = tmp[three - 1];
        }
    return answer;     
    }
}
