class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n);
        int [] arr = new int[str.length()];
        int[] answer =new int[str.length()];
        for(int i = 0 ; i<str.length(); i++){
            arr[i] = str.charAt(i) -'0';
        }
        for(int i = 0; i<arr.length; i++){
            answer[i] = arr[arr.length-i-1];
        }
        return answer;
    }
}
