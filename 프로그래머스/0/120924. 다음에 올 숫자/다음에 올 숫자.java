class Solution {
    public int solution(int[] common) {
        int answer = 0;
        int gap1 = common[2] - common[1];
        int gap2 = common[1] - common[0];
        
            
        if(gap1 == gap2){
            answer = common[common.length - 1] + gap1 ;
        }
        else{
            answer = common[common.length - 1] * (gap1 / gap2) ;
        }
        return answer;
    }
}