class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int result = 0;
        while(chicken  != 0){
            answer += chicken / 10;
            result += (chicken % 10);
            chicken  /= 10;      
        }
        
        while(true){
            answer += result / 10;
             result =  (result/10) + (result%10);
            if(result<10){
                break;
            }
        }
        
        return answer;
    }
}
