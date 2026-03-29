package src;

import java.io.*;
import java.util.*;

public class Solve10814 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); //회원 수

        Map<Integer, List<String>> member = new TreeMap<>();

        for (int i = 0; i < N; i++){
            String [] input = br.readLine().split(" ");
            int age = Integer.parseInt(input[0]);
            member.putIfAbsent(age, new ArrayList<>());
            member.get(age).add(input[1]);
        }
        //key 값 : 나이 value ArrayList
        for(int key : member.keySet()) {
            for(String name : member.get(key)){
                System.out.println(key + " " + name);
            }
        }
    }
}
