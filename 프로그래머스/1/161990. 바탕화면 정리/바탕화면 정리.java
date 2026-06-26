class Solution {
    public int[] solution(String[] wallpaper) {
        int maxX = 0; int maxY = 0;
        int minX = 50; int minY = 50;
        
        for(int x = 0; x < wallpaper.length; x++){
            for(int y = 0; y < wallpaper[x].length(); y++){
                if(wallpaper[x].charAt(y) == '#'){
                    maxX = Math.max(maxX, x);
                    maxY = Math.max(maxY, y);
                    minX = Math.min(minX, x);
                    minY = Math.min(minY, y);
                }
            }
        }
        int [] answer = {minX, minY, maxX+1, maxY+1};
        return answer;
    }
}