package src;

import java.io.*;
public class Solve10950 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        for(int i = 0; i < testCase; i++){
            String [] input = br.readLine().split(" ");
            System.out.println(Integer.parseInt(input[0])+Integer.parseInt(input[1]));
        }
    }
}
