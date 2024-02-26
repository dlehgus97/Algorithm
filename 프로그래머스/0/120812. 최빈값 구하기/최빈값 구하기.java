class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int [] arr = new int [1001];
        
        for(int i = 0 ; i<array.length; i++){
            arr[array[i]]++;
        }
        
        int max = 0;
        int result = 0;
        
        for(int i = 0 ; i<1001; i++){
            if(arr[i]>max){
                max = arr[i];
                result = i;
            }
        }
        int count = 0;
        
        for(int i = 0 ; i<1001; i++){
            if(max == arr[i]){
                count++;
            }
        }
        if(count>1){
            answer = -1;
        }
        else {
            answer = result;
        }
        return answer;
    }
}