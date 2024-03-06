class Solution {
    public int solution(int n) {
        int answer = 1;
        
        for(int i = 1; i<n; i++){
                    int tmp = 0;
            
            for(int j = i+1 ; j<=n; j++){
                tmp += j;
                if(i + tmp == n){
                    answer++;
                }
                else if(i + tmp > n){
                    break;
                }
            }
        }
        return answer;
    }
}