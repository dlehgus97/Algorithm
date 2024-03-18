class Solution {
    public int[] solution(String[] park, String[] routes) {
        int[] answer = new int[2];

        boolean flag = false;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    answer[0] = i;
                    answer[1] = j;
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                break;
            }
        }
     
        
        for (int i = 0; i < routes.length; i++) {
            char way = routes[i].charAt(0);
            int num = (int) routes[i].charAt(2) - '0';
            boolean check = true;
            int a = answer[0];
            int b = answer[1];

            for (int j = 0; j < num; j++) {
                if (way == 'N') {
                    answer[0]--;
                    if (answer[0] < 0 || answer[1] < 0 || answer[0] >= park.length || answer[1] >= park[0].length()) {
                        answer[0] = a;
                        answer[1] = b;
                        break;
                    }

                    if (park[answer[0]].charAt(answer[1]) == 'X') {
                        check = false;
                        break;
                    }
                } else if (way == 'S') {
                    answer[0]++;
                    if (answer[0] < 0 || answer[1] < 0 || answer[0] >= park.length || answer[1] >= park[0].length()) {
                        answer[0] = a;
                        answer[1] = b;
                        break;
                    }

                    if (park[answer[0]].charAt(answer[1]) == 'X') {
                        check = false;
                        break;
                    }
                } else if (way == 'W') {
                    answer[1]--;
                    if (answer[0] < 0 || answer[1] < 0 || answer[0] >= park.length || answer[1] >= park[0].length()) {
                        answer[0] = a;
                        answer[1] = b;
                        break;
                    }

                    if (park[answer[0]].charAt(answer[1]) == 'X') {
                        check = false;
                        break;
                    }
                } else if (way == 'E') {
                    answer[1]++;
                    if (answer[0] < 0 || answer[1] < 0 || answer[0] >= park.length || answer[1] >= park[0].length()) {
                        answer[0] = a;
                        answer[1] = b;
                        break;
                    }

                    if (park[answer[0]].charAt(answer[1]) == 'X') {
                        check = false;
                        break;
                    }
                }
            }
            if(!check){
                answer[0] = a;
                answer[1] = b;
            }

        }
        return answer;
    }
}