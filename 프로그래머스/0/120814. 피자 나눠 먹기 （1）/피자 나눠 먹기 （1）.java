class Solution {
    public int solution(int n) {
        int answer = 0;
        answer += n / 7;
        n -= (n / 7) * 7;
        if(n % 7 != 0){
            answer ++;
        }
        return answer;
    }
}