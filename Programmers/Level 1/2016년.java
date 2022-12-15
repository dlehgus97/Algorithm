class Solution {
    public String solution(int a, int b) {
        String answer = "";
        String [] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"} ;
        int [] month ={31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int num = b-1;
        if(a>1){
        for(int i = 0; i<a-1; i++){
            num += month[i];
            }
        }
        answer = day[num%7];
        
        return answer;
    }
}
