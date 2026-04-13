package src;
import java.io.*;
import java.util.Arrays;

public class Solve7568 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int [] weight = new int[N]; //몸무게 저장
        int [] height = new int[N]; //키 저장
        int [] rank = new int[N]; //순위 저장

        Arrays.fill(rank, 1);
        for(int i = 0; i < N; i++){
            String [] input = br.readLine().split(" ");
            weight[i] = Integer.parseInt(input[0]);
            height[i] = Integer.parseInt(input[1]);
        }
        for(int i = 0; i < N; i++){
            for(int j = 0; j < N; j++){
                if(weight[i] < weight[j] && height[i] < height[j]){
                    rank[i]++;
                }
            }
        }
        for(int i : rank){
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}

