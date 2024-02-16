class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int check = 0;
        
        int num = x;
        
        for(int i = 0 ; i<str.length(); i++){
            check += num % 10;
            num /= 10;
        }
        
        
        if(x % check == 0){
            answer = true;
        }
        else{
            answer = false;
        }
        
        return answer;
    }
}