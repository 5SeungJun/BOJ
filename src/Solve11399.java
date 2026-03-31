package src;
import java.io.*;
import java.util.Arrays;

public class Solve11399 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N =Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        int [] P = new int [N];
        for(int i =0; i < N; i++){
            P[i] = Integer.parseInt(input[i]);
        }
        Arrays.sort(P);
        long [] f = new long[N];
        f[0] = P[0];
        for(int i = 1; i < N; i++){
            f[i] = f[i-1] + P[i];
        }
        long sum = 0;
        for(long i : f){
            sum += i;
        }
        System.out.println(sum);
    }
}
