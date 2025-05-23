import java.io.*;
import java.util.*;

public class Solve1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input[] = br.readLine().split(" ");
        //입력 받을 포켓몬 수
        int countPokemon = Integer.parseInt(input[0]);
        //맞춰야할 정답 수
        int countQuestion = Integer.parseInt(input[1]);

        Map<String, Integer> Encyclopedia = new HashMap<>(); //번호와 포켓몬을 저장할 맵.
        Map<Integer, String> numberToName = new HashMap<>(); //번호에 대응하는 이름 저장할 맵

        for (int i = 1; i <= countPokemon; i++) {
            String pokemon = br.readLine();
            Encyclopedia.put(pokemon, i);
            numberToName.put(i, pokemon);
        }

        for (int i = 0; i < countQuestion; i++) {
            String inputQuestion = br.readLine();
            if (Character.isDigit(inputQuestion.charAt(0))) {
                int number = Integer.parseInt(inputQuestion);
                bw.write(numberToName.get(number) + "\n");
            } else {
                bw.write(Encyclopedia.get(inputQuestion) + "\n");
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
