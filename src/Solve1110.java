package src;
import java.util.*;
public class Solve1110 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;
        //1. 각 자리수끼리 더하고,
        //2. 오른쪽 수랑, 오른쪽 수랑 합치기.

        int target = N;
        while(true){
            count++;
            int left;
            int right;
            if(target < 10){
                left = 0;
            }
            else{
                left = target / 10;
            }
            right = target % 10;
            int temp = left + right;
            right *= 10;
            target = right + (temp%10);
            if(target == N) break;
        }
        System.out.println(count);
    }
}
