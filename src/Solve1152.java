package src;
import java.io.*;
public class Solve1152 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []input = br.readLine().split(" ");
        if(input[0].equals("")){
            System.out.println(input.length-1);
        }
        else System.out.println(input.length);
    }
}
