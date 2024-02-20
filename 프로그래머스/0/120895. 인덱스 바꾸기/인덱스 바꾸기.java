class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        
        Character []arr = new Character [my_string.length()];
        
        for(int i = 0 ; i<my_string.length(); i++){
            arr[i] = my_string.charAt(i);
        }
        
        char tmp = ' ';
        
        tmp = arr[num1];
        arr[num1] = arr[num2];
        arr[num2] = tmp;
        
        for(int i = 0 ; i<arr.length; i++){
            answer +=arr[i];
        }
        
        return answer;
    }
}