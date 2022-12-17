class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        int num = b / gcd(a,b);
        if(a % b == 0){
            answer = 1;
            return answer;
        }
        
        while(num != 1){
            int tmp = 0;
            for(int i = 2 ; i<=num; i++){
                if(num % i == 0){
                    tmp = i;
                    break;
                }
            }
            if(tmp == 2 || tmp == 5){
                answer = 1;
            }
            else {
                answer = 2;
                break;
            }
            num /= tmp;
        }
    
        return answer;
         }
  
        static int gcd(int A,int B){
        if(B == 0){
            return A;
        }
        return gcd(B,A%B);
    }
}
     
