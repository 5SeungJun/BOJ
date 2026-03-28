package src;
import java.io.*;
import java.util.Arrays;

public class Solve1920 {
    public static int binarySearch(int [] arr, int target){
        int left = 0, right = arr.length-1; //인덱스
        while(left <= right){
            int mid = (left + right) / 2; //중간 인덱스
            if(arr[mid] > target){
                right = mid-1;
            }
            else if(arr[mid] < target ){
                left = mid+1;
            }
            else if(arr[mid] == target) {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String [] args) throws IOException {
        BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String [] targetNum = br.readLine().split(" ");

        int [] A = new int[N];
        for(int i = 0; i<N; i++){
            A[i] = Integer.parseInt(targetNum[i]);
        }
        Arrays.sort(A); //이분 탐색을 위한 정렬

        int M = Integer.parseInt(br.readLine());
        String [] inputNum = br.readLine().split(" ");
        int [] B = new int [M];
        for(int i = 0; i < M; i++){
            B[i] = Integer.parseInt(inputNum[i]);
        }

        for(int i = 0; i<M; i++){
            bw.write(binarySearch(A, B[i]) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
