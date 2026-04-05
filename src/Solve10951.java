package src;

import java.io.*;
public class Solve10951 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String line = br.readLine();
            if(line == null) break;
            String [] input = line.split(" ");
            System.out.println(Integer.parseInt(input[0])+Integer.parseInt(input[1]));
        }
    }
}

