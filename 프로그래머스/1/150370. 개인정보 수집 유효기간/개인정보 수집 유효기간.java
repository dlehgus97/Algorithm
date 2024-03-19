import java.util.*;

class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        String[] result = today.split("\\."); 
        String[][] arr = new String[terms.length][2];

        for (int i = 0; i < terms.length; i++) {
            String[] str = terms[i].split(" ");
            arr[i][0] = str[0];
            arr[i][1] = str[1];
        }

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < privacies.length; i++) {
            String[] com = privacies[i].split(" ");
            String[] date = com[0].split("\\."); 
            int year = Integer.parseInt(date[0]) ;
            int month = 0;
            int day = Integer.parseInt(date[2]) - 1;
            
            for(int j = 0 ; j<terms.length; j++){
                if(arr[j][0].equals(com[1])){
                    month = Integer.parseInt(date[1]) + Integer.parseInt(arr[j][1]);
                        if(day == 0) {
                            day = 28;
                            month --;
                        }
                    if(month > 12){
                        if(month % 12  == 0){
                            int num = month / 12;
                            year += num - 1;
                            month = 12;
                        }
                        else{
                        int num = month / 12 ;
                        year += num;
                        month -=  num * 12 ;
                    }
                    break;
                    }
                }
            }
            
            if(Integer.parseInt(result[0])>year){
                list.add(i + 1);
                continue;
            }
            else if(Integer.parseInt(result[0])<year){
                continue;
            }
            else if(Integer.parseInt(result[0]) == year){
                 if(Integer.parseInt(result[1])>month){
                     list.add(i+1);
                     continue;
                 }
                else if(Integer.parseInt(result[1])<month){
                    continue;
                }
                else if(Integer.parseInt(result[0]) == year){
                     if(Integer.parseInt(result[2])>day){
                         list.add(i+1);
                         continue;
                     }
                    else if(Integer.parseInt(result[2])<year){
                        continue;
                    }
                    else {
                        list.add(i+1);
                        continue;
                    }
                }
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}
