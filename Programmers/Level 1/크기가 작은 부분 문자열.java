class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String [] arr = new String[t.length() -p.length() + 1];

        for(int i = 0 ; i<arr.length; i++) {
            arr[i] = t.substring(i, i + p.length());
            if (Long.parseLong(arr[i]) <= Long.parseLong(p)) {
                answer++;
            }
        }
        return answer;
    }
}

//Integer.parseInt 로 했다가 실패 보니까 1 ≤ p의 길이 ≤ 18 조건이 있어서 Long 타입으로 바꿔줘야 했다.
