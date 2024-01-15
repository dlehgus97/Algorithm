class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        String result_1 = "";
        String result_2 = "";
        
        for(int i = 0 ; i<num_list.length; i++){
            if(num_list[i] % 2 != 0){
                result_1 += Integer.toString(num_list[i]);
            }
            else {
                result_2 += Integer.toString(num_list[i]);

            }
        }
        answer = Integer.parseInt(result_1) + Integer.parseInt(result_2);
        return answer;
    }
}