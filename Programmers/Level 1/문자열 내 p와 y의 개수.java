class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String [] arr = s.toUpperCase().split("");

        int result1= 0;
        int result2=0;
    
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i].equals("P"))
                result1 ++;
            if(arr[i].equals("Y"))
                result2 ++;
        }
        if(result1 != result2){
            answer = false;
        }
        return answer;
    }
}
