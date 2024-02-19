class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int result_1 = 0;
        int result_2 = 1;
        
        for(int i = 0 ; i<num_list.length; i++){
            result_1 += num_list[i];
            result_2 *= num_list[i];
        }
        if((result_1 * result_1)> result_2){
            answer = 1;
        } 
        else 
            answer = 0;
        
        return answer;
    }
}