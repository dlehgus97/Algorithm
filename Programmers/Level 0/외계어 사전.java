class Solution {
    public int solution(String[] spell, String[] dic) {
        int answer = 2;
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];

        for (int i = 0; i < spell.length; i++) {
            arr1[spell[i].charAt(0) - 'a']++;
        }

        for (int i = 0; i < dic.length; i++) {
            int result = 0;

            for (int j = 0; j < dic[i].length(); j++) {
                arr2[dic[i].charAt(j) - 'a']++;
            }

            for (int k = 0; k < 26; k++) {
                if (arr1[k] == arr2[k]) {
                    result++;
                }
                arr2[k] = 0;
            }            
            if (result == 26) {
                answer = 1;
                break;
            }
        }
        return answer;
    }
}
