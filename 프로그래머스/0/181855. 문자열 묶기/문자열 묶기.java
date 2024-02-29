class Solution {
    public int solution(String[] strArr) {
        int answer = Integer.MIN_VALUE;
        int [] arr = new int [31];
        
        for(int i = 0 ; i<strArr.length; i++){
            arr[strArr[i].length()]++;
        }
        
        for(int s : arr){
            if(answer<s){
                answer = s;
            }
        }
        return answer;
    }
}