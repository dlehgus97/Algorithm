class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        int tmp = i;
        while (tmp <= j) {
            i = tmp;
            while(i>0){
                if(i %10 == k){
                    answer ++;
                }
                i /= 10;
            }
            tmp++;}
        return answer;
    }
}

//for문을 사용한 다른 사람들 방법

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for(int num = i; num<=j; num++){
             int tmp = num;
            while(tmp>0){
                if(tmp %10 == k){
                    answer ++;
                }
                tmp /= 10;
            }
        
        }
        return answer;
    }
}
