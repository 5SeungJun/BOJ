package src;

import java.util.NoSuchElementException;
import java.util.Scanner;
public class Solve4806 {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        while(true){
            try{
                sc.nextLine();
                count++;
            }catch(NoSuchElementException e){
                System.out.println(count);
                return;
            }
        }

    }
}
