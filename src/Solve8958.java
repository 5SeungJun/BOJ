package src;
import java.io.*;

public class Solve8958 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCase; i++){
            String input = br.readLine();
            int score = 0;
            int count = 0;
            for(int j = 0; j <input.length(); j++){
                if(input.charAt(j) == 'O'){
                    score += ++count;
                }
                else{
                    count = 0;
                }
            }
            bw.write(score+"\n");
        }
        bw.flush();
        bw.close();
    }
}
