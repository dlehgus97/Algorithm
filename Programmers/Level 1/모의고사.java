class Solution {
    public int[] solution(int[] answers) {
       
        int [] one = {1,2,3,4,5};
        int [] two = {2,1,2,3,2,4,2,5};
        int [] three = {3,3,1,1,2,2,4,4,5,5};
        int [] num =new int [3] ;

        for(int i = 0 ; i<answers.length; i++){
            if(one[i%5] == answers[i]){
                num[0]++;
            }
            if(two[i%8] == answers[i]){
                num[1]++;
            }
            if(three[i%10] == answers[i]){
                num[2]++;
            }
        }
        int max = num[0] ;

        for(int i = 1 ; i<num.length; i++){
            if(num[i]>max){
                max = num[i];
            }
        }
        int result = 0 ;
        for(int i = 0 ; i<num.length; i++){
            if(max == num[i]){
                result++;
            }
        }
        int[] answer = new int[result];
        int idx = 0 ;
        for(int i = 0 ; i<num.length; i++){
            if(max == num[i]){
                answer[idx] = i+1;
                idx++;
            }
        }  
  return answer;  
    }     
}
