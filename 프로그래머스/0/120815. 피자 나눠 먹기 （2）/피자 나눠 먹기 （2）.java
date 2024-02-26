class Solution {
    public int solution(int n) {
        int answer = ((6 * n) / gcd(n,6)) / 6  ;
        
        return answer;
    }
    public static int gcd(int a,int b){
        if(b == 0){
            return a;
        }
        else return gcd(b, a % b);
    }
}