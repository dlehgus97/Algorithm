class Solution {
    public int solution(String str1, String str2) {
        int answer = 2;
        
        str1 = str1.replace(str2," ");
        if(str1.contains(" ")){
            answer = 1;
        }
        return answer;
    }
}