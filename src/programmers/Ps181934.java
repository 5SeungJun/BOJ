package src.programmers;

public class Ps181934 {
    public int solution(String ineq, String eq, int n, int m) {
        if(ineq.equals("<")){
            switch(eq){
                case "=":
                    return (n <= m)? 1 : 0;
                case "!":
                    return (n < m)? 1 : 0;
            }
        }
        else{
            switch(eq){
                case "=":
                    return (n >= m)? 1 : 0;
                case "!":
                    return (n > m)? 1 : 0;
            }
        }
        return 0;
    }
}
