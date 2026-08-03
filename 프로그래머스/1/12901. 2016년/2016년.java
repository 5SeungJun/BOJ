class Solution {
    public String solution(int a, int b) {
        String [] week = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
        int [] days = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30}; //idx = 0 : 1월
        int day = b;
        for(int i = 0; i < a; i++){
            day += days[i];
        }
        return week[day%7];
    }
}