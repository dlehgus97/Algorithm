class Solution {
    public String solution(int[] food) {
        String answer = "";
        String result = "";
        for(int i = 1; i <food.length; i++){
            int num = food[i] / 2;
            if(num>0){
                for(int j = 0; j<num; j++){
                    result += Integer.toString(i);
                }
            }
        }
        
        answer = result;
        answer += "0";
        
        for(int i = result.length() -1 ; i>=0; i--){
            answer += (char)(result.charAt(i));
        }
        
        return answer;
    }
}