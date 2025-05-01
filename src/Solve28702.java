import java.io.*;
public class Solve28702 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nextNum = 0; //다음에 올 숫자를 저장할 변수
        int count = 0;
        for(int i = 0; i < 3; i++){
            String input = br.readLine();
            if(!input.equals("Fizz") && !input.equals("Buzz") && !input.equals("FizzBuzz")) { //문자열이 아닌 숫자 형태라면?
                nextNum = Integer.parseInt(input) + 1; //String인 input값을 int로 바꾸고 + 1
            }
            else //nextNum값이 저장된 상태에서 마지막에 문자열이 입력된 경우, 1을 추가해줘야 그 다음 수를 알 수 있음.
                if(nextNum != 0) nextNum += 1;
        }

        if((nextNum % 3) == 0){ //3의 배수이고
            if((nextNum % 5) == 0) //동시에 5의 배수이면
                System.out.println("FizzBuzz");
            else
                System.out.println("Fizz");
        }
        else if((nextNum % 5) == 0)
            System.out.println("Buzz");
        else
            System.out.println(nextNum);

    }
}
