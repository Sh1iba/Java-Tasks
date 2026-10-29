package task03;

public class Main {
    public static void main(String[] args) {
        String[] participants = {"Саша", "Игорь", "Миша", "Коля", "Владимир"};
        int[][] scores = {
            {4, 3, 2, 5, 1},
            {3, 4, 4, 6, 2},
            {2, 5, 4, 3, 2},
            {8, 4, 2, 0, 4},
            {4, 4, 3, 2, 9},
        };
        String[] res = new String[participants.length];
        int summ = 0;
        for (int i = 0; i < participants.length; i++) {
            for (int j = 0; j < 5; j++) {
                summ += scores[i][j];
            }
            res[i] = participants[i] + ": " + summ + " баллов";
            summ = 0;
            System.out.println(res[i]);
        }
    }
}
