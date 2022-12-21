class Solution {
    public int solution(int n) {
        int answer = 0;
         for(int i = 1; i<= n; i++){
            answer++;
            while(true){
                String str = Integer.toString(answer);
                if(str.contains("3")){
                    answer ++;
                }
                else if (answer % 3 == 0){
                    answer ++;
                }
                else
                    break;
            }
        }
        return answer;
    }
}
