package src;
import java.io.*;
public class Solve2231 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int length = num.length(); //자리수를 알기 위함.
        int N = Integer.parseInt(num);

        int start = Math.max(1, N-9*length); //각 자리수에 올 수 있는 최대값은 9이므로, 탐색 범위를 최소화하기 위함
        int target = 0;

        for(int i = start; i < N; i++){
            int sum = i;
            int temp = i;
            while(temp > 0){ //자기 자신에 각 자리수를 더함
                sum += temp % 10;
                temp /= 10;
            }
            if(sum == N){
               target = i;
               break;
            }
        }
        System.out.println(target);
    }
}
