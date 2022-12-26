class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        String word  = A;
        for(int i = 0 ; i<A.length(); i++){
            if(word.equals(B)){
                return answer;
            }
            String result = word.substring(0, A.length() - 1);
            word = word.substring(A.length() - 1) + result;
            answer ++;
        }
        if(answer == A.length()){
            answer = - 1;
        }
        return answer;
    }
}
