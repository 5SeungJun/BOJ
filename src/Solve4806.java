package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solve4806 {
    public static void main(String [] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int count = 0;
//        while(true){
//            try{
//                sc.nextLine();
//                count++;
//            }catch(NoSuchElementException e){
//                System.out.println(count);
//                return;
//            }
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        while(br.readLine() != null){
            count++;
        }
        System.out.println(count);
    }
}
