package src;
import java.io.*;
import java.util.*;
public class Solve2292 {
    public static void main(String [] args) throws IOException{
        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int count = 2; //몇번째 칸인지,
        int testCase = 1; //수의 구간을 보기 위함.
        if (N == 1) {
            System.out.println(1);
        }
        else{
            N -= 1; //1은 제외하고 탐색
            while(true){
                N -= 6*testCase;
                if(N <= 0) break;
                else {
                    testCase++;
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
