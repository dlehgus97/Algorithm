class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int [(int)(right - left) + 1];
            
        int count = 0 ;
        
        for(long i = left ; i<=right ; i++){
            long num = Math.max((i / n) , (i % n)) + 1;
            answer[count] = (int)num;
            count++;
        }
        
        return answer;
    }
}