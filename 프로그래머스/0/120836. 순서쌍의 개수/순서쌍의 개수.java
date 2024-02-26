class Solution {
    public int solution(int n) {
        int answer = 0;
        int i;
        for( i = 1 ; i*i<n; i++){
            if(n % i == 0){
                answer++;
            }
        }
        if(n / i == i){
            answer = (answer * 2) + 1;
        }
        else{
            answer *= 2;
        }
        
        return answer;
    }
}