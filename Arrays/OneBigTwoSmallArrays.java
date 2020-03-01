package Arrays;

import java.io.BufferedReader;
import java.io.InputStreamReader;
/*Один большой массив и два маленьких
        1. Создать массив на 20 чисел.
        2. Ввести в него значения с клавиатуры.
        3. Создать два массива на 10 чисел каждый.
        4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
        5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.


        Требования:
        1. Программа должна создавать большой массив на 20 целых чисел.
        2. Программа должна считывать с клавиатуры 20 чисел для большого массива.
        3. Программа должна создавать два маленьких массива на 10 чисел каждый.
        4. Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во
        второй и вывести второй маленький массив на экран.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class OneBigTwoSmallArrays {

    public static void main(String[] args) throws Exception {
        int[] array20 = new int[20];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array20.length; i++) {
            String name = reader.readLine();
            array20[i] = Integer.parseInt(name);
        }

        int[] array101 = new int[10];
        for (int i = 0; i < array20.length / 2; i++) {
            array101[i] = array20[i];

        }
        int[] array102 = new int[10];
        for (int i = 0; i < array20.length / 2; i++) {
            array102[i] = array20[i + 10];
            System.out.println(array102[i]);
        }
    }
}