package src;
import java.io.*;
import java.util.*;
public class Solve2577 {
    public static void main(String [] args)throws IOException{
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int result = A*B*C;

        String temp = result+"";
        int [] num = new int[10];
        Arrays.fill(num, 0);
        for(int i = 0; i <= temp.length()-1; i++){
            int idx = (int)temp.charAt(i) - 48;
            num[idx]++;
        }
        for(int i : num){
            System.out.println(i);
        }
    }
}
