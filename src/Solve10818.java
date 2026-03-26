package src;

import java.io.*;

public class Solve10818 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        String [] input = br.readLine().split(" ");
        int [] arr = new int[count];
        for(int i = 0; i < count; i++){
            arr[i] = Integer.parseInt(input[i]);
        }
        // 100 0 1 3 4 200
        // min=100 max=0 1부터 비교 min=1 max=0
        int min = Integer.MAX_VALUE; //2147142..
        int max = Integer.MIN_VALUE; //-2147111..
        for(int i = 0; i < count; i++){
            if(arr[i] > max)
                max = arr[i];
            if(arr[i] < min)
                min = arr[i];
        }
        bw.write(min + " " + max);
        bw.flush();
        bw.close();
    }
}
