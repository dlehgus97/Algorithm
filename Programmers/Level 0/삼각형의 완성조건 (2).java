import java.util.Arrays;
class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);
        int answer = 0;
        if(sides[1] - sides[0] ==1){
            answer = 1;
            return answer;
        }
        for(int i = sides [1] - sides[0]; i<=sides[1]; i++){
            if(sides[0] + i > sides[1]){
                answer ++;
            }
        }
        for(int i = sides[1] +1; i<sides[0] + sides[1]; i++){
              answer++;
        }
        return answer;
    }
}
