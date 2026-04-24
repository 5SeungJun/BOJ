class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        String [] babb = {"aya", "ye", "woo", "ma"};
        for(int i = 0; i < babbling.length; i++){
            String tempBabbling = babbling[i];
            String temp = tempBabbling;
            for(int j = 0; j < babb.length; j++){
                temp = temp.replace(babb[j],"1");
            }
            temp = temp.replace("1","");
            if(temp.equals("")) answer++;
        }
        return answer;
    }
}