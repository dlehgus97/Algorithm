import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        int result = 0 ;
        Arrays.sort(arr);
        
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] % divisor == 0){
                result ++;
            }
        }
        if(result == 0){
           int [] answer = {-1};
            return answer;
        }
        
        int[] answer = new int[result];
        int num = 0;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] %divisor == 0){
                answer[num] = arr[i];
                num++;
            }
        }
        
        return answer;
    }
}
