class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        
        int num = 0;
        
        for(int i = 0 ;i<arr.length; i++){
            if(arr[i].equals(" ")){
                num = 0;
            }
            else if(num % 2 != 0){
                arr[i] = arr[i].toLowerCase();
                num++;
            }
            else if(num % 2 == 0){
                arr[i] = arr[i].toUpperCase();
                num++;
            }
            answer += arr[i];
        }
        return answer;
    }
}

//이따 반성문 쓰기 
