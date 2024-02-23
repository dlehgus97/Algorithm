class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        boolean check1 = false;
        boolean check2 = false;
        if(x1  == true || x2 == true){
            check1 = true;
        }
        if(x3 == true || x4 == true){
            check2 = true;
        }
        
        if(check1 == true && check2 == true){
            answer = true;
        }
        else{
            answer = false;
        }
        return answer;
    }
}