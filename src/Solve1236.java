package src;

import java.io.*;

public class Solve1236 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        String [][] castle = new String[N][M];
        for(int i = 0; i < N; i++){
            castle[i] = br.readLine().split("");
        }

        int rowCount = 0;
        int colCount = 0;

        for(int i = 0; i < N; i++){
            boolean isSafeRow = false;
            for(int j = 0; j < M; j++){
                if(castle[i][j].equals("X")){
                    isSafeRow = true;
                }
            }
            if(!isSafeRow){ //해당 행에 경비가 하나도 없으면;
                rowCount++;
            }
        }
        for(int i = 0; i < M; i++){
            boolean isSafeCol = false;
            for(int j = 0; j<N; j++){
                if(castle[j][i].equals("X")){
                    isSafeCol = true;
                }
            }
            if(!isSafeCol)colCount++;
        }
        System.out.println(Math.max(rowCount, colCount));
    }
}
