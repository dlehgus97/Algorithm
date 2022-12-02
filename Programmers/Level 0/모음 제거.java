class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replace("a","").replace("e","").replace("i","").replace("o","").replace("u","");
        return answer;
    }
}

//이렇게 하면 보기 흉하다 ..

class Solution {
    public String solution(String my_string) {
        String answer = "";
        answer = my_string.replaceAll("[a,e,i,o,u]","");
        return answer;
    }
}

앞으로는 이렇게 하기를 ..
