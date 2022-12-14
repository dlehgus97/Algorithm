class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int tmp = x;
        int result = 0 ;
        while(tmp != 0){
            result += tmp%10;
            tmp /= 10;
        }
        if(x%result != 0){
            answer =false;
        }
        return answer;
    }
}
