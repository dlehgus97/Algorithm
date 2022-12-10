import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.*;
import java.util.Set;

public class Main {
    public static  void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr= new String[T];


        for(int i = 0 ; i<T; i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr,new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if(s1.length() == s2.length()) {
                    return s1.compareTo(s2);
                } else {
                    return s1.length() - s2.length();
                }
            }
        });

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append("\n");
        for(int i = 1 ; i<T; i++){
            if(!arr[i].equals(arr[i-1]))
            sb.append(arr[i]).append("\n");
        }
        System.out.println(sb);

    }
}
/*rrays.sort() 메소드 안에는 두 객체(원소)를 비교하여 위치를 바꿀지 말지 판단하면서 정렬을 한다.

기본적으로 Comparator는 객체를 비교할 수 있도록 해주는 인터페이스다. 보통 int, char, double 등의 자바에서 제공하는 자료형들은 비교가 가능하지만, 여러분이 사용자 클래스를 만들어 비교한다거나, 특정 규칙에 의해 비교를 하고 싶은 경우에는 Comparator를 구현해야 한다.

 

일단 간단하게 설명만 하자면, <? super T> 는 상속관계에 있는 타입만 자료형으로 받겠다는 의미이고, 이 말인 즉 T 타입이 자식클래스가 되고, T의 상속관계에 있는 타입까지만 허용하겠다는 의미다. 이해가 안된다면 일단은 물음표는 생략하고 <T> 이렇게 생각하셔도 된다.

 

더 쉽게 말하자면 T = Type 을 의미하며 객체, 자료형 등의 다양한 타입 중 하나를 설정 할 수 있다는 것이다.

 

우리가 해야할 것은 단어 정렬이니 기본적으로 정렬할 배열의 타입은 String 이 될 것이다. 즉 T 는 String 이 된다는 것이다.

이렇게 Comparator 의 타입을 넣었으면, 다음으로 해야할 것은 compare 메소드를 오버라이딩하는 것이다. 즉, 아래 코드가 기본형이 되겠다.

참고 https://st-lab.tistory.com/110#%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98 */

//실패한 코드 ㅠ

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static  void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr= new String[T];


        for(int i = 0 ; i<T; i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr);


        for(int i = 0 ; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                String tmp = "";
                if(arr[i].length()>arr[j].length()){
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;
                }
            }

        }

        StringBuilder sb = new StringBuilder();
        sb.append(arr[0]).append("\n");
        
        for(int i = 1 ; i<T; i++){
            if(!arr[i].equals(arr[i-1]))
            sb.append(arr[i]).append("\n");
        }

        System.out.println(sb);
    }
}
