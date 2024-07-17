import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                // n번째 문자를 비교
                Character c1 = s1.charAt(n);
                Character c2 = s2.charAt(n);
                if (c1 == c2) {
                    // n번째 문자가 같다면 전체 문자열을 비교
                    return s1.compareTo(s2);
                } else {
                    // 그렇지 않다면 n번째 문자를 비교
                    return c1.compareTo(c2);
                }
            }
        });
        
        // 정렬된 배열 반환
        return strings;
    }
}