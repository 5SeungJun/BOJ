package src;
import java.io.*;
public class Solve1152 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String [] temp = str.split(" ");
        int count = 0;
        for(String i : temp){
            if(i != "") count++;
        }
        System.out.println(count);
    }
}
