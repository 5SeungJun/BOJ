import java.io.*;
public class Solve11050 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);
        int result =1;
        for(int i = 0; i < K ; i++){
            result *= N-i;  // N * (N-1) * (N-2) * ... * (N-K-1)
        }
        int divide = 1;
        for(int i = 1; i <= K; i++){
            divide *= i;  // 1 * 2 * ...  * K
        }
        System.out.println(result/divide);
    }
}
