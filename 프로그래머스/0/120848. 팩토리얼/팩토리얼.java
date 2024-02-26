class Solution {
    public int solution(int n) {
        int answer = 0;
        int count = 1;
        int num = 1;
        
        while(true){
            num *= count;
            if(num>n){
                answer = count -1;
                break;
            }
            else if(num == n){
                answer = count;
                break;
            }
            count++;
        }
        return answer;
    }
}