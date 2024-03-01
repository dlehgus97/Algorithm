class Solution {
    public String[] solution(String[] str_list) {
        int num = 0;
        String str = "";
        String [] answer = null;
        for(int i = 0 ; i<str_list.length ; i++){
            if(str_list[i].equals("l") || str_list[i].equals("r")){
                num = i;
                str = str_list[i];
                break;
            }
        }
        
        if(str.equals("l")){
        answer = new String[num];
        for(int i = 0 ; i<answer.length; i++){
            answer[i] = str_list[i];
            }
        }
        else if(str.equals("r")){
            answer = new String[str_list.length - num -1];
            int count = 0;
            
            for(int i = num + 1; i<str_list.length; i++){
                answer[count] = str_list[i];
                count++;
            }
        }
        else if(str.equals("")){
            answer = new String [0];
        }
        return answer;
    }
} 