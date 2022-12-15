class Solution {
    public int[] solution(int n, int m) {
        int[] answer = {gcd(n,m),m*n/gcd(n,m)};
        
        return answer;
    }
      static int gcd(int A,int B){
        if(B == 0){
            return A;
        }
        return gcd(B,A%B);
    }
}
