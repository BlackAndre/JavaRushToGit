package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

// Вот так делать обратный вывод массива



public class ReverseArrayOrder {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String[] array = new String[10];
        String olol = Arrays.toString(array);
        for (int i = 0; i < 8; i++) {
            array[i] = reader.readLine();
        }

        for (int i = array.length - 1; i >= 0; i-= 1) {

            System.out.println(array[i]);
        }
    }
}