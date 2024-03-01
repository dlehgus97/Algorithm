class Solution {
    public String[] solution(String[] picture, int k) {
        String[] answer = new String[picture.length * k];
        
        String [] tmp =  new String[picture.length];
        
        for(int i = 0 ; i<picture.length; i++){
            String str ="";
            for(int j = 0 ; j<picture[i].length(); j++){
                for(int l = 0; l<k; l++){
                    str += picture[i].charAt(j);
                }
            }
            tmp[i] = str;
        }
        
        int count = 0;
        
        answer[0] = tmp[count];
        
        for(int i = 1 ; i<answer.length; i++){
            if(i % k == 0 ){
                count++;
            }
            answer[i] = tmp[count];
        }
        return answer;
    }
}