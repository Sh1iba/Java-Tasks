package task05;

public class Main {
    public static void main(String[] args) {
        float[] arr = {1.3F, 3.2F, 5.1F, 4.7F};
        float summ = 0;
        float max = 0;
        for (float i : arr) {
            summ += i;
            if(i > max){
                max = i;
            }
            System.out.println(i);
        }
        System.out.println("Сумма чисел массива: " + summ);
        System.out.println("Наибольший элемент: " + max);

    }
}
