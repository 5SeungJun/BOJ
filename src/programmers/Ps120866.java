package src.programmers;

public class Ps120866 {
    public int solution(int[][] board) {
        int answer = 0;
        int row = board.length;
        int col = board[0].length;

        int temp[][] = new int[row][col];

        for(int i = 0; i < row; i++){
            temp[i] = board[i].clone();
        }

        int dx[] = {-1, -1, -1, 0, 0, 1, 1, 1};
        int dy[] = {-1, 0, 1, -1, 1, -1, 0, 1};

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(board[i][j] == 1){
                    for(int k = 0; k < dx.length; k++){
                        int x = i + dx[k];
                        int y = j + dy[k];
                        if(x >= 0 && x < row && y >=0 && y < col){
                            temp[x][y] = 1;
                        }
                    }
                }
            }
        }
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++){
                if(temp[i][j] == 0)
                    answer++;
            }
        return answer;
    }
}
