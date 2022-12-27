class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String word = my_string.replaceAll("[a-zA-Z]"," ");
        String [] arr = word.split(" ");
        
            for(int i = 0; i<arr.length; i++){
            if(!arr[i].equals("")) {
                answer += Integer.parseInt(arr[i]);
            }
        }      
        return answer;
    }
}

//for(String s : arr) 배열에서만 사용 가능 
class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String word = my_string.replaceAll("[a-zA-Z]"," ");
        String [] arr = word.split(" ");
        
       for(String s : arr){
           if(!s.equals("")){
               answer+= Integer.parseInt(s);
           }
       }
        
        return answer;
    }
}
