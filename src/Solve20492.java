package src;

import java.util.Scanner;

public class Solve20492 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        System.out.println((int)(N-(N*0.22)) + " " + (int)(N-((N*0.2)*0.22)));

    }
}
