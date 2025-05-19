import java.io.*;
import java.util.*;

public class Solve7576 {
    public static int N;
    public static int M;
    public static int[][] box;

    public static int[] dx = {1, -1, 0, 0};
    public static int[] dy = {0, 0, 1, -1};

    public static Queue<Tomato> queue = new LinkedList<Tomato>();

    static class Tomato {
        int x, y, day;

        public Tomato(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());

        box = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            for (int j = 0; j < M; j++) {
                box[i][j] = Integer.parseInt(st.nextToken());
                if (box[i][j] == 1) { //익은 토마토라면
                    queue.offer(new Tomato(i, j, 0)); //queue에 i, j, 0일 저장.
                }
            }
        }
        bfs();
    }

    public static void bfs() {
        int day = 0;

        while (!queue.isEmpty()) {
            Tomato t = queue.poll(); //익은 토마토의 좌표, 일수를 받아옴
            day = t.day;

            for (int i = 0; i < 4; i++) {
                int nx = t.x + dx[i]; //익은 토마토의 상,하,좌,우 인덱스를 탐색
                int ny = t.y + dy[i];

                if (0 <= nx && nx < N && 0 <= ny && ny < M) { //행이 0보다 크면서 N보다 작고, 열이 0보다 크면서 M보다 작으면
                    if (box[nx][ny] == 0) { //안 익었으면
                        box[nx][ny] = 1; //익은 걸로 갱신
                        queue.add(new Tomato(nx, ny, day + 1)); //익은 좌표, 일수를 큐에 삽입
                    }
                }
            }
        }
        if (checkTomato()) {
            System.out.println(day);
        } else {
            System.out.println(-1);
        }
    }

    //모든 칸의 토마토가 익었는지 확인하는 함수
    static boolean checkTomato() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (box[i][j] == 0) //덜 익은 토마토가 있으면
                    return false;
            }
        }
        return true;
    }
}

