class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int result = 7;
        int sum = 0;
        
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0){
                sum++;
            }
            for(int j = 0 ; j<win_nums.length; j++){
                if(lottos[i] == win_nums[j]){
                    result --;
                }  
            }         
        }  
        answer[0] = result  - sum;
        answer[1] = result;
        if(answer[1] == 7){
            answer[1] = 6;
        }
        if(answer[0] == 7){
            answer[0] = 6;
        }
        return answer;
    }
}
