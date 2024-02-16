class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        for(int i = 0 ; i<t.length() - p.length() + 1; i++){
            String num = "";
            for(int j = i ; j<p.length() + i; j++){
                num += t.charAt(j);
            }
            if(Long.parseLong(num)<=Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}