class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        
        int mid = 0;
        if(num % 2 != 0){
            mid = total / num;
            
            for(int i = 0 ; i<num; i++){
                answer[i] =  mid - (num/2) + i;
            }
        }
        else{
            mid = total / num ;
            
            for(int i = 0 ; i<num; i++){
                answer[i] =  mid - ((num / 2)) + i + 1 ;
            }
        }
        
        
        return answer;
    }
}