class Solution {
    public int[] solution(int n) {
        int [ ]answer ;
        if(n%2 == 0){
        answer = new int[n/2];
        }
        else{
           answer = new int[n/2 +1];
        }
        int k = 0; 
        for(int i = 0;i<=n; i++){
            if(i%2 ==1 ){
                answer[k] = i;
                k++;
            }
        }
        return answer;
    }
}


// 다른 방법

class Solution {
    public int[] solution(int n) {
        int[] answer = new int[(n+1)/2];
        int k = 0;
        for(int i = 1; i<=n; i++)
            if(i%2==1){
                answer[k] = i;
                k++;
                
            }
        
        return answer;
    }
}
