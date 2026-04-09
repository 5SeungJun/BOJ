package src;
import java.util.*;
import java.io.*;
public class Solve10989 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer,Integer> temp = new TreeMap<>(); //key : 정수 , value : 등장횟수

        int N = Integer.parseInt(br.readLine()); //입력 받을 수의 개수
        int [] count = new int [10001]; //1~10,0000까지 중복 확인용 배열
        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }
        for(int i = 0; i < 10001; i++){
            if(count[i] > 0){
                for(int j = count[i]; j > 0; j--){
                    bw.write(i + "\n");
                }
            }
        }
        bw.flush();
        bw.close();
    }
}
