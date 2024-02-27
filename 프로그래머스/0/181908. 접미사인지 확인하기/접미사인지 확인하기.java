class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 1;
        int count = 0;
        
        if(my_string.length() >= is_suffix.length()){
            for(int i = my_string.length() - is_suffix.length(); i<my_string.length(); i++){
                if(my_string.charAt(i) != is_suffix.charAt(count)){
                    answer = 0 ;
                    break;
                }
                count++;
            }
        }
        else{
            answer = 0;
        }
        return answer;
    }
}