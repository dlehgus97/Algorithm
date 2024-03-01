class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int count = 0;
       
        
        for(int i = 0 ; i<myString.length() - pat.length() + 1; i++){
            String str = "";
            for(int j = i; j<i+pat.length(); j++){
                str += myString.charAt(j);
            }
            if(str.equals(pat)){
                count++;
            }
        }
        int result = 0;
        
        for(int i = 0 ; i<myString.length() - pat.length() + 1; i++){
            String str = "";
            for(int j = i; j<i+pat.length(); j++){
                str += myString.charAt(j);
            }
            if(str.equals(pat)){
                result++;
            }
            if(result == count){
                for(int j = 0 ; j<i+pat.length(); j++){
                    answer +=myString.charAt(j);
                     }
                break;
                }
            }
       
        return answer;
    }
}