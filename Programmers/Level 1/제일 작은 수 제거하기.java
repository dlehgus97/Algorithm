class Solution {
    public int[] solution(int[] arr) {
         
        if(arr.length == 1){
            int[]answer  = {-1};
            return answer;
        }
         
        int [] answer = new int[arr.length-1];
        int min = arr[0];
        int num = 0;


        for(int i = 0 ; i<arr.length; i++){
            if(min >arr[i]){
                min = arr[i];
                num = i;
            }
        }
        
        for(int i = 0 ;i<num; i++){
            answer[i] = arr[i];
        }
        for(int i =num; i<arr.length-1; i++){
            answer[i] = arr[i+1];
        }
        
        return answer;
    }
}
