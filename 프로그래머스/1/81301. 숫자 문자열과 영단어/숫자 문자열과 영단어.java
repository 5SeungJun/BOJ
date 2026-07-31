class Solution {
    public int solution(String s) {
        String [] temp = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        for(int i = 0; i < temp.length; i++){
            s = s.replace(temp[i], String.valueOf(i));
        }
        
        return Integer.parseInt(s);
    }
}