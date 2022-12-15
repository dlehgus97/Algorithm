import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        int[] num = new int [201];
        Arrays.sort(numbers);
        
        for(int i = 0 ; i<numbers.length-1; i++){
            for(int j = i+1 ;j<numbers.length; j++){
                num[numbers[i] + numbers[j]] ++;
            }
        }
        
        int result = 0;
        
        for(int i = 0; i<num.length; i++){
            if(num[i]>0){
                result ++;
            }
        }
        int [] answer = new int[result];
        int a = 0 ;
        for(int i = 0 ; i<num.length; i++){
            if(num[i]>0){
               answer[a] = i;
                a++;
            }  
        }
        return answer;
    }
}
