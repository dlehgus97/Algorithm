class Solution {
    public int solution(int n) {
        int answer = 1;
        int count = 0;
        
        while(count<n){
            String str = Integer.toString(answer);
            
            if (answer % 3 != 0 && !str.contains("3")) {
                count++; 
            }
            
            answer++; 
        }
        return answer - 1;
    }
}