package src;
import java.io.*;

public class Solve11047 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int K = Integer.parseInt(input[1]);

        int [] inputMoney = new int[N];
        for(int i = 0; i < N; i++){
            inputMoney[i] = Integer.parseInt(br.readLine());
        }

        int idx = 0;
        for(int i = N-1; i > 0; i--){
            if(inputMoney[i] <= K){
                idx = i;
                break;
            }
        }
        if(inputMoney[idx] == K){
            System.out.println(1);
        }
        else {
            int count = 0;
            for (int i = idx; i >= 0; i--) {
                int n = 0;
                if (K / inputMoney[i] > 0) {
                    n = K / inputMoney[i];
                    count += n;
                    K -= inputMoney[i] * n;
                }
            }
            System.out.println(count);
        }
    }
}
