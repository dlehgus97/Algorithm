class Solution {
    public String solution(String my_string) {
        String answer = "";
        String [] arr = my_string.split("");
        String [] word = {"a","e","i","o","u"};
        for(int i = 0 ; i<arr.length; i++){
            boolean check = false;
            for(int j = 0 ; j<word.length; j++){
            if(arr[i].equals(word[j])){
                check = true;
                break;
                }
            }
            if(!check){
                answer += arr[i];
            }
        }
        return answer;
    }
}