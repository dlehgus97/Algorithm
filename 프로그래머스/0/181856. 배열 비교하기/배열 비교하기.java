class Solution {
    public int solution(int[] arr1, int[] arr2) {
        int answer = 0;
        if(arr1.length != arr2.length){
            if(arr1.length<arr2.length){
                answer = -1;
            }
            else{
                answer = 1;
            }
        }
        else{
            int num1 = 0;
            for(int i = 0 ; i<arr1.length; i++){
                num1 += arr1[i];
            }
            int num2 = 0;
            for(int i = 0 ; i<arr2.length; i++){
                num2 += arr2[i];
            }
            
            if(num1 == num2){
                answer = 0;
            }
            else{
                if(num1>num2){
                    answer = 1;
                }
                else{
                    answer = -1;
                }
            }
        }
        

        return answer;
    }
}