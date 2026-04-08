package src;
import java.io.*;
import java.util.*;

public class Solve3052 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer,Integer> arr = new HashMap<>();

        for(int i = 0; i < 10; i++){
            int num = Integer.parseInt(br.readLine());
            int temp = num % 42;
            arr.putIfAbsent(temp, 1);
        }
        System.out.println(arr.size());
    }
}
