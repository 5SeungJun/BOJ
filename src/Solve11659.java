import java.util.*;
import java.io.*;

public class Solve11659 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        //데이터의 개수, 질의 개수 입력
        int dataCount = sc.nextInt();
        int question = sc.nextInt();

        //구간합 배열 생성 후, 정의
        int sumData[] = new int[dataCount];

        //구한 합을 구할 대상 배열 값 입력 (데이터 개수 만큼 반복)
        int[] dataSet = new int[dataCount];
        dataSet[0] = sc.nextInt();
        sumData[0] = dataSet[0];
        for (int i = 1; i < dataCount; i++) {
            dataSet[i] = sc.nextInt();
            sumData[i] = sumData[i - 1] + dataSet[i];
        }
        //질의 입력
        for (int i = 0; i < question; i++) {
            int firstIdx = sc.nextInt();
            int lastIdx = sc.nextInt();
            //입력받은 구간합 구하고 출력.
            if (firstIdx == 1)
                bw.write(sumData[lastIdx - 1] + "\n");
            else
                bw.write(sumData[lastIdx - 1] - sumData[firstIdx - 2] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
