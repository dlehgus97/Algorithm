import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        HashMap<String, Integer> map = new HashMap<>();
        boolean[][] check = new boolean[id_list.length][id_list.length];
            
        // 각 유저의 인덱스를 HashMap에 저장
        for (int i = 0; i < id_list.length; i++) {
            map.put(id_list[i], i);
        }
        
        int[] result = new int[id_list.length]; // 신고 당한 횟수 기록
        
        for(int i = 0; i < report.length; i++) {
            String[] arr = report[i].split(" ");
            
            if(!check[map.get(arr[0])][map.get(arr[1])]) { // 중복 신고
                result[map.get(arr[1])]++; // 신고 당한 횟수
                check[map.get(arr[0])][map.get(arr[1])] = true;
            }
        }
        
        for(int i = 0; i < id_list.length; i++) {
            if(result[i] >= k) { // k번 이상 신고 당한 경우
                for(int j = 0; j < id_list.length; j++) {
                    if(check[j][i]) { //  신고한 사람
                        answer[j]++;
                    }
                }
            }
        }
        return answer;
    }
}
