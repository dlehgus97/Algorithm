class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        if(a == b && c == b && a == c){
            answer += (a * 3) * ((a * a) * 3) * ((a * a * a) * 3);
        }
        else if(a == b && b != c){
            answer += (a+b+c) * ((a * a) + (b * b) + (c * c));
        }
        else if(a == c && b != c){
            answer += (a+b+c) * ((a * a) + (b * b) + (c * c));
        }
        else if(b == c && a != c){
            answer += (a+b+c) * ((a * a) + (b * b) + (c * c));
            
        }
        else if( a != b && b != c && c != a){
            answer += a+b+c;
        }
        return answer;
    }
}