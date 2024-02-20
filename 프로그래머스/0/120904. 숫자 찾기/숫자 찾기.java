class Solution {
    public int solution(int num, int k) {
        String str = Integer.toString(num);
        int answer = -1;
        int length = str.length();
        
        while(length>0){
            if(num % 10 == k){
                answer = length;
            }
            num /= 10;
            length--;
        }
        return answer;
    }
}