class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int [2];
        
        int count = 0 ;
        int zero = 0;
        
        for(int i = 0 ; i<lottos.length ; i++){
            if(lottos[i] == 0){
                zero++;
                continue;
            }
            for(int j = 0; j< win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                    break;
                }
            }
        }
        int best = count + zero;
        int worst = count;
        
        if(best < 2){
            answer[0] = answer[1] = 6;
        }
        else{
            answer[0] = 7 - best;
            if(worst<2){
                answer[1] = 6;
            }
            else{
                answer[1] = 7 - worst;
            }
        }
        
        return answer;
    }
}