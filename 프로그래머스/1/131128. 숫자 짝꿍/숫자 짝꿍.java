import java.util.*;
class Solution {
    public String solution(String X, String Y) {
        int [] countX = new int[10];
        ArrayList<Character> arr = new ArrayList<>();
        for(int i = 0; i < X.length(); i++){
            int x = X.charAt(i) -'0';
            countX[x] += 1;
            
        }
        //Y의 값이랑 비교해서 같은 수가 있으면? arr에 그 숫자 저장하고, value--
        for(int i = 0; i < Y.length(); i++){
            char y = Y.charAt(i);
            int idx = y-'0';
            if(countX[idx] > 0){
                arr.add(y);
                countX[idx]--;
            }
        }
        if(arr.size() > 0){
            StringBuilder sb = new StringBuilder();
            arr.sort(Comparator.reverseOrder());
            for(char a : arr){
                sb.append(a);
            }
            if(sb.charAt(0) == '0'){
                return "0";
            }
            else return sb.toString();
        }else{
            return "-1";
        }
    }
}