class Solution {
    public int solution(String A, String B) {
        int answer = -1;
        int count = 0 ;
        String word = A;
        
        if(A.equals(B)){
            return 0;
        }
        else{
        for(int i  = 0 ; i<A.length() -1 ; i++){
            String tmp = "";
            tmp += word.charAt(A.length()-1);
            
            for(int j  = 0; j<A.length() -1; j++){
                tmp += word.charAt(j);
            }
            word = tmp;
            count++;
            if(word.equals(B)){
            answer = count;
                break;
            }
        }
        return answer;
      }
    }
}