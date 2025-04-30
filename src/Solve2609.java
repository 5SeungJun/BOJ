import java.io.*;
public class Solve2609 {
    static int GCD(int a, int b){
        int temp;
        while(b != 0){
            temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
    static int LCM(int a, int b, int gcd){
        return a*b/gcd;
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        String input [] = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        int gcd = GCD(a, b);
        bw.write(gcd + "\n");
        bw.write(LCM(a, b, gcd) + "\n");
        bw.flush();
        bw.close();
    }
}
