class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String [] word = polynomial.split(" \\+ ");
        int result1 = 0;
        int result2 = 0;

        for(int i = 0 ; i<word.length; i++) {
            if (word[i].equals("x")) {
                word[i] = "1x";
            }
        }
        for(int i = 0 ; i<word.length; i++){
            if(word[i].contains("x")){
                String str = word[i].substring(0,word[i].length() -1);
                result1 += Integer.parseInt(str);
            }
            else
                result2 +=Integer.parseInt(word[i]);
        }
        
        if(result1>0 && result2>0) {
            String total1 = Integer.toString(result1);
            String total2 = Integer.toString(result2);
            if(total1.equals("1")){
                answer +=  "x + " + total2;
            }
            else{
            answer += total1 + "x + " + total2;
            }
        }
        else if(result1>0&&result2 ==0){
            String total1 = Integer.toString(result1);
            if(total1.equals("1")){
                answer += "x";
            }
            else{
            answer +=total1+"x";
            }
        }
        else if(result1 == 0 && result2>0){
            String total2 = Integer.toString(result2);
            answer += total2;
        }
        return answer;
    }
}

//다양한 조건을 봐야한다 
