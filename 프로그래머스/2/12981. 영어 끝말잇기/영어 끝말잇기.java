class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = new int [2];
        answer[0] = 0;
        answer[1] = 0;
        boolean check  = true;
        
        for(int i = 0 ; i<words.length - 1; i++){
            if(words[i].charAt(words[i].length() - 1) == words[i+1].charAt(0)){
                for(int j = 0 ; j<i+1; j++){
                    if(words[i+1].equals(words[j])){
                        check = false;
                    }
                }
            }
            else if(words[i].charAt(words[i].length() - 1) != words[i+1].charAt(0)){
                check = false;
            }
            if(!check){
                System.out.println(i);
                answer[0] = (i+1) % n  + 1;
                answer[1] = (i+1) / n  + 1;
                System.out.println(words[i]);
                System.out.println(words[i+1]);
                break;
            }
            
        }
        
           
        return answer;
    }
}