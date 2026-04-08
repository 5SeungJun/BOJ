package src;
import java.io.*;
public class Solve2884 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String [] input = br.readLine().split(" ");
        int H = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);
        if(M < 45){
            if(H > 0){
                H -= 1;
            }
            else{
                H = 23;
            }
            M += 15;
        }
        else{
            M -= 45;
        }
        System.out.println(H +" " + M);
    }
}
