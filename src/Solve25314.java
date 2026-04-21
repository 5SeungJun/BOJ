package src;
import java.util.*;
public class Solve25314 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String s = "int";
        while(N > 0){
            N -= 4;
            String add = "long ";
            s = add + s;
        }
        System.out.println(s);
    }
}
