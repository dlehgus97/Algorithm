class Solution
{
    public int solution(int n, int A, int B)
    {
        int answer =  0;
        
        while(A != B){
            if(A % 2 != 0 ){
                A += 1 ;
                A /= 2;
            }
            else {
                A /= 2;
            }
            if(B % 2 != 0 ){
                B += 1 ;
                B /= 2;
            }
            else {
                B /= 2;
            }
            answer ++;
        }

        return answer;
    }
}