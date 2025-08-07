import java.io.*;
import java.util.*;

public class Solve1253 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int arr[] = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isGoodNum(arr, i))
                count++;
        }

        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    public static boolean isGoodNum(int arr[], int index) {
        int firstIdx = 0;
        int lastIdx = arr.length - 1;
        int targetNum = arr[index];
        //자기 자신을 제외해야함.
        while (firstIdx < lastIdx) {
            if (firstIdx == index) {
                firstIdx++;
                continue;
            }
            if (lastIdx == index) {
                lastIdx--;
                continue;
            }

            if (arr[firstIdx] + arr[lastIdx] == targetNum)
                return true;
            else if (arr[firstIdx] + arr[lastIdx] > targetNum) {
                lastIdx--;
            } else if (arr[firstIdx] + arr[lastIdx] < targetNum) {
                firstIdx++;
            }
        }
        return false;
    }
}
