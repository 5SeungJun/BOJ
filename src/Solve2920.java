package src;
import java.io.*;
public class Solve2920 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String [] input = br.readLine().split(" ");
        int [] temp = new int [input.length];

        boolean isMixed = false;
        for(int i = 0; i < input.length; i++){
            temp[i] = Integer.parseInt(input[i]);
        }
        if(temp[0] == 1){
            for(int i = 1; i <temp.length; i++){
                if(temp[i] == temp[i-1] + 1) continue;
                else {
                    isMixed = true;
                    break;
                }
            }
            if(!isMixed){
                System.out.println("ascending");
            }
        }
        else if(temp[0] == 8){
            for(int i = 1; i < temp.length; i++){
                if(temp[i] == temp[i-1]-1) continue;
                else {
                    isMixed = true;
                    break;
                }
            }
            if(!isMixed){
                System.out.println("descending");
            }
        }
        else isMixed = true;
        if(isMixed){
            System.out.println("mixed");
        }
    }
}
