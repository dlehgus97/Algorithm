class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int [2];
        
        int num1 = numer1 * denom2  + numer2 * denom1;
        int num2 = denom1 * denom2;
        
        answer[0] = num1 / gcd(num1,num2);
        answer[1] = num2 / gcd(num1,num2);
        return answer;
    }
    
    public static int gcd(int a, int b){
        if(b == 0){
            return a;
        }
        else return gcd(b,a%b);
    }
}