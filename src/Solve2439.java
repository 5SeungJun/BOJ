import java.util.*;
public class Solve2439 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = N-1;

        for(int i = 0; i < N; i++) {
            for (int j = 0; j < count; j++)
                System.out.print(" ");

            for(int k = count; k < N; k++)
                System.out.print("*");

            count--;
            System.out.println();
        }
    }
}
