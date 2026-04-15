package src;
import java.util.*;
public class Solve1436 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int num = 665;
        int count = 0;

        while(N != count){
            num++;
            String temp = Integer.toString(num);
            if(temp.contains("666")){
                count++;
            }

        }
        System.out.println(num);
    }
}
