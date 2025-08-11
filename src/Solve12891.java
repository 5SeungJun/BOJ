import java.io.*;
import java.util.*;

public class Solve12891 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int inputLength = Integer.parseInt(st.nextToken());
        int targetLength = Integer.parseInt(st.nextToken());

        char inputArr[] = br.readLine().toCharArray(); //문자열 입력


        int judge[] = new int[4]; //문자열에 포함돼야 할 A,C,G,T의 최소 개수를 저장할 배열
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; i++) {
            judge[i] = Integer.parseInt(st.nextToken());
        }

        int current[] = new int[4]; //윈도우에 포함된 문자열 상태를 저장할 배열
        int count = 0;

        for (int i = 0; i < targetLength; i++) {
            add(current, inputArr[i]); //첫번째 윈도우 초기화
        }
        if (check(current, judge)) count++; //첫번째 윈도우 확인

        for (int i = targetLength; i < inputLength; i++) {
            add(current, inputArr[i]); //윈도우가 오른쪽으로 이동해, 새로 들어온 문자
            delete(current, inputArr[i - targetLength]); //윈도우에서 빠진 문자
            if (check(current, judge)) count++;
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }

    public static void add(int arr[], char c) {
        switch (c) {
            case 'A':
                arr[0]++;
                break;
            case 'C':
                arr[1]++;
                break;
            case 'G':
                arr[2]++;
                break;
            case 'T':
                arr[3]++;
                break;
        }
    }

    public static void delete(int arr[], char c) {
        switch (c) {
            case 'A':
                arr[0]--;
                break;
            case 'C':
                arr[1]--;
                break;
            case 'G':
                arr[2]--;
                break;
            case 'T':
                arr[3]--;
                break;
        }
    }

    public static boolean check(int arr[], int judge[]) {
        for (int i = 0; i < 4; i++) {
            if (arr[i] < judge[i]) //값이 다르면 false
                return false;
        }
        return true;
    }
}
