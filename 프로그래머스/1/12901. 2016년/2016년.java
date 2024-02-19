class Solution {
    public String solution(int a, int b) {
        String answer = "";
        int [] day = {31,29,31,30,31,30,31,31,30,31,30,31};
        String [] word = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
        
        int tmp = 0;
        
        for(int i = 0 ; i<a-1; i++){
            tmp += day[i];
        }
        tmp += b;
        
        answer = word[tmp % 7];
        
        return answer;
    }
}