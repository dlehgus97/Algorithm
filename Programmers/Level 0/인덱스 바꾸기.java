class Solution {
    public String solution(String str, int num1, int num2) {
        String answer = "";
        String [] arr = str.split("");
        String tmp = arr[num2];
        arr[num2] = arr[num1];
        arr[num1] = tmp;
        for(int i = 0 ; i<arr.length; i++){
            answer += arr[i];
        }
        return answer;
    }
}
