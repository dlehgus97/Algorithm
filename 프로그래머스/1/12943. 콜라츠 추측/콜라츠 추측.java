class Solution {
    public int solution(long num) {
        int answer = 0;
        boolean check = false;
        if(num == 1){
            answer = 0;
        }
        else{
        while(true){
            if(num % 2 == 0){
                num /= 2;
                answer++;
            }
            else if(num % 2 != 0){
                num = num * 3 + 1;
                    answer++;
            }
            if(num == 1 ){
                check = true;
                break;
                }
            if(answer >= 500){
                break;
                }
            }
        if(!check){
            answer = -1;
            }
        }
        return answer;
    }
}
