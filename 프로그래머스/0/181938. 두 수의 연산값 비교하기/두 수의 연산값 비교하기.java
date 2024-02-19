class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);
        
        if(Integer.parseInt(str1+str2)>2*(a*b)){
            answer = Integer.parseInt(str1+str2);
        }
        else{
            answer = 2*(a*b);
        } 
        return answer;
    }
}