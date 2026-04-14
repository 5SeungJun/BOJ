package src;
import java.io.*;
public class Solve2579 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int [] stair = new int [N];
        int [] f = new int [N];

        //계단 값 입력받기
        for(int i = 0; i < N; i++){
            stair[i] = Integer.parseInt(br.readLine());
        }
        if(N == 1){
            System.out.println(stair[0]);
            return;
        }
        f[0] = stair[0];
        f[1] = stair[0] + stair[1];
        if(N >= 3){ //3번째 계단 올때, (1번째, 3번째)를 밟았냐 or (2번째, 3번째) 계단을 밟았냐
            f[2] = Math.max(stair[0] + stair[2], stair[1] + stair[2]);
        }
        for(int i = 3; i < N; i++){
            f[i] = Math.max(f[i-2] + stair[i], f[i-3] + stair[i-1] + stair[i]);
        }
        System.out.println(f[N-1]);
    }
}
