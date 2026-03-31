package src;

import java.io.*;
import java.util.*;

public class Solve1018 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        char[][] board = new char[N][M];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine().toCharArray();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                int countW = 0; // 시작이 W
                int countB = 0; // 시작이 B

                for (int x = 0; x < 8; x++) {
                    for (int y = 0; y < 8; y++) {
                        char current = board[i + x][j + y];

                        if ((x + y) % 2 == 0) {
                            if (current != 'W') countW++;
                            if (current != 'B') countB++;
                        } else {
                            if (current != 'B') countW++;
                            if (current != 'W') countB++;
                        }
                    }
                }
                min = Math.min(min, Math.min(countW, countB));
            }
        }
        System.out.println(min);
    }
}