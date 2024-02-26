class Solution {
    public String solution(int age) {
        String answer = "";
        String [] alp = {"a","b","c","d","e","f","g","h","i","j"};
        String tmp = "";
        while(age> 0){
            tmp += alp[age%10];
            age /= 10;
        }
        for(int i = tmp.length() - 1; i>=0; i--){
            answer += tmp.charAt(i);
        }
        
        return answer;
    }
}