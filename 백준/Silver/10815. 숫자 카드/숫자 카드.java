import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer,Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i = 0; i<N; i++){
            map.put(Integer.parseInt(st.nextToken()),0);
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<M; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(map.containsKey(num)) {
                sb.append(1 + " ");
            }
            else {
                sb.append(0 + " ");
            }
        }
       System.out.println(sb);
    }
}