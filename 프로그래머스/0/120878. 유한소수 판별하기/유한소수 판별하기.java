class Solution {
    public int solution(int a, int b) {
        int answer = 1;
        
        int num = gcd(a,b);
        b = b / num;
        
        while(true){
            if(b % 2 == 0){
                b /= 2;
            }
            if(b % 5 == 0){
                b /= 5;
            }
            if(b == 1){
                break;
            }
            if( b != 1 && b % 2 != 0 && b  % 5 != 0){
                answer = 2;
                break;
            }
        }
        
        return answer;
    }
    
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        else return gcd(b,a %b);
    }
}