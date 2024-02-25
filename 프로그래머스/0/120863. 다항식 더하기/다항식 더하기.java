import java.io.*;
import java.util.*;

class Solution {
    public String solution(String polynomial) {
        String answer = "";
        String str = polynomial.replace(" + " , "_");
        String [] arr = str.split("_");
        
        int num1 = 0;
        int num2 = 0;
        
        for(int i = 0 ; i<arr.length ;i++){
            if(arr[i].contains("x")){
                String word = arr[i].substring(0, arr[i].length() - 1);
                if(word.isEmpty()){
                    num1++;
                }
                else {
                num1 += Integer.parseInt(word);
                }
            }
            else{
                num2 += Integer.parseInt(arr[i]);
            }
        }
        
        
        if(num1 == 0){
            answer = Integer.toString(num2);
        }
        else if(num2 == 0){
            if(num1 == 1){
                answer = "x";
            }
            else{
           answer = Integer.toString(num1) + "x";
            }
        }
        else if(num2 != 0){
            if(num1 == 1){
            answer = "x + " + Integer.toString(num2); 
            }
            else {
            answer = Integer.toString(num1)+ "x + " + Integer.toString(num2);      
            }
        }
     
    
        return answer;
    }
}