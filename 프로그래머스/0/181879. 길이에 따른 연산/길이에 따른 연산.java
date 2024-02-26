class Solution {
    public int solution(int[] num_list) {
        int answer = 1;
        
        for(int i = 0 ; i<num_list.length; i++){
            if(num_list.length>10){
                answer +=num_list[i] ;
            }
            else{
                answer *= num_list[i];
            }
        }
        if(num_list.length > 10){
            answer--;
        }
        return answer;
    }
}