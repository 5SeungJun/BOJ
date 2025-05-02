import java.io.*;
import java.util.*;
public class Solve1929 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] input = br.readLine().split(" ");
        int M = Integer.parseInt(input[0]);
        int N = Integer.parseInt(input[1]);

        boolean [] isPrime = new boolean[N+1]; //소수인지 아닌지 판별할 배열 true=소수, false=소수x
        Arrays.fill(isPrime, true); //모든 수를 true로 초기화 후, 소수가 아니면 배제하기 위함.
        isPrime[0] = false;
        isPrime[1] = false;

        int judgeNum = (int)Math.sqrt(N); //N의 제곱근까지만 검사해도 됨.(그 이후엔 수식이 대칭되기 때문)

        for(int i = 2; i <= judgeNum; i++) { //2부터 N의 제곱근까지 탐색
            if (isPrime[i]) { //소수라면?
                for (int j = i * i; j <= N; j += i) { //중복을 최소화하기 위해, 소수의 제곱값부터 그 값을 더해가며 제거
                    isPrime[j] = false;
                }
            }
        }
        //주어진 값 범위의 소수만 출력
        for(int i = M; i <= N; i++){
            if(isPrime[i])
                bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
