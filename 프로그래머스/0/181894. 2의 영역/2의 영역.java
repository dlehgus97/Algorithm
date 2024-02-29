import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer; 
        ArrayList<Integer> list = new ArrayList<>(); 
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                list.add(i);
            }
        }
        
        if (list.isEmpty()) {
            answer = new int[1];
            answer[0] = -1;
        } 
        else if (list.size() == 1) {
            answer = new int[1];
            answer[0] = 2;
        } 
        else {
            int size = list.get(list.size() - 1) - list.get(0) + 1;
            answer = new int[size];
            int count = 0;
            for (int i = list.get(0) ; i <= list.get(list.size() -1); i++) {
                answer[count] = arr[i];
                count++;
            }
        }
        return answer;
    }
}
