import java.io.*;
public class Solve4949 {
    public static class Stack{
        private int top; //스택 최상단 인덱스
        private char arr[]; //스택 배열

        public Stack(int n){ //스택 객체 초기화
            top = -1;
            arr = new char[n];
        }
        public boolean is_empty(){ //비어있는지 확인할 메서드
            return top == -1;
        }
        public char pop(){ //스택 최상단의 값 리턴 메서드
            return arr[top--];
        }
        public void push(char ch){ //스택에 값 저장 메서드
            arr[++top] = ch;
        }
    }
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while(true){
            String input = br.readLine(); //문자열 입력 받음
            if(input.equals(".")) //"."만 입력된 경우 종료.
                break;

            Stack stack = new Stack(input.length()); //문자열 길이만큼의 스택공간 할당.
            boolean isBalanced = true; //균형 잡힌 문자열인지 판별

            for(int i = 0; i < input.length(); i++) {
                char ch = input.charAt(i); //판별을 위해 해당 인덱스의 문자를 저장함.
                if (ch == '(') {
                    stack.push(ch); //스택에 저장
                } else if (ch == '[') {
                    stack.push(ch); //스택에 저장
                } else if (ch == ')') { // ')'문자를 발견했을때
                    if (stack.is_empty() || stack.pop() != '(') { //스택이 비어있거나, 스택 최상단이 '('가 아니면
                        isBalanced = false; //균형 X
                        break; //바로 종료
                    }
                } else if (ch == ']') { // ']'문자를 발견했을때
                    if (stack.is_empty() || stack.pop() != '[') { //스택이 비어있거나, 스택 최상단이 '['가 아니면
                        isBalanced = false; //균형 X
                        break; //바로 종료
                    }
                }
            }
            if(!stack.is_empty()) isBalanced = false; //스택이 비어있지 않다면? 균형 X
            bw.write(isBalanced? "yes\n" : "no\n"); //true(균형 O)면 yes, false(균형 x)면 no
        }
        bw.flush(); //버퍼 출력
        bw.close();
    }
}
