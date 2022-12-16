class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int min = 100; 
        int [] result = new int[array.length];
        for(int i = 0 ; i<array.length; i++){
            result[i] = Math.abs(array[i] - n);
            if(min == result[i]){
                if(array[i]<n){
                    answer = array[i];
                }
            }
            if(min>result[i]){
                min = result[i]; 
                answer = array[i];
            }          
        }
        return answer;
    }
}
