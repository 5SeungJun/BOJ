package src;
import java.io.*;
public class Solve14626 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int idx = 0; //숫자 위치
        int sum = 0;
        String input = br.readLine();

        for (int i = 0; i < input.length(); i++) {
            char s = input.charAt(i);
            if (s == '*') {
                idx = i; //찾아야되는 숫자 위치 저장
                continue;
            }
            int tempNum = Integer.parseInt(String.valueOf(s));

            if (i % 2 == 0) {//홀수 번째 수면 그대로 저장
                sum += tempNum;
            } else { //짝수 번째 수면 3곱해야함
                sum += tempNum * 3;
            }
        }
        for (int i = 0; i <= 9; i++) {
            int target;
            if(idx % 2 == 0){
                target = sum + i;
            }else{
                target = sum + i * 3;
            }
            if(target % 10 == 0){
                System.out.println(i);
                break;
            }
        }
    }
}
