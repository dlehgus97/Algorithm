import java.util.*;

class Solution {
    public String solution(String input_String) {
        //set을 사용한 이유는 중복이 안되기 때문에 
        //e가 10번 나와도 10번 추가해도 결과적으로 1번만 추가 
        HashSet<Character> Alp = new HashSet<>(); //외톨이 알파벳
        HashSet<Character> set = new HashSet<>(); // 이전 알파벳 

        //앞에꺼랑 뒤를  비교해야하기 반복문을 1부터하고 앞에꺼 pre에 넣어서 비교한다 
        char pre = input_String.charAt(0);
        set.add(pre);

        for (int i = 1; i < input_String.length(); i++) {
            char cur = input_String.charAt(i);

            //알파벳이 전 알파벳이랑 다를때 조건 
            if (cur != pre) {
                //이전 알파벳이랑 다른데 이미 방문한 조건 외톨이 알파벳이 되버리는 슬픈 사실 
                if (set.contains(cur)) {
                    Alp.add(cur);
                }
                set.add(cur);
            }
            // 현재는 이전이 되버린다
            pre = cur;
        }

        //여기서부터는 진짜 이해 할 꺼라고 생각합니다  .
    
        List<Character> result = new ArrayList<>(Alp);
        Collections.sort(result);

        String answer = "";
        for (char tmp : result) {
            answer += tmp;
        }

        if(answer.isEmpty()){
            return "N";
        }
        else{
            return answer;
        }
    }
}


