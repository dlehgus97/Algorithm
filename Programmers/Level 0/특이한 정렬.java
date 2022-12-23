class Solution {
    public int[] solution(int[] numlist, int n) {
        int[] answer = new int [numlist.length];
        
        for(int i = 0 ; i<numlist.length; i++){
            int count = 0;
            for(int j = 0 ; j<numlist.length; j++){
                if(Math.abs(numlist[i] - n)>Math.abs(numlist[j] - n)){
                    count ++;
                }
                else if((Math.abs(numlist[i] - n) == Math.abs(numlist[j] - n)) &&(numlist[i] - n) < (numlist[j] - n)){
                    count ++;
                }
            }
            answer[count] = numlist[i];
        }
        
        return answer;
    }
}
