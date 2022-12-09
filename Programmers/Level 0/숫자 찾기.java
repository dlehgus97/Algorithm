class Solution {
    public int solution(int num, int k) {
       int answer = 0;
        String str = String.valueOf(num);
        int[] arr = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] =(str.charAt(i)-'0');
            if (arr[i] == k) {
                answer = i + 1;
                break;
            }
            else
                answer = -1;
        }
        return answer;
    }
}

//indexOf를 사용하면 금방 찾는다 ..

class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        answer = str.indexOf(String.valueOf(k));
        if(answer>=0)
            return answer+1;
        else
            return answer;
        }
    }
