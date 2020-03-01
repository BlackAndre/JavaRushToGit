package Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*Улицы и дома
        1. Создать массив на 15 целых чисел.
        2. Ввести в него значения с клавиатуры.
        3. Пускай индекс элемента массива является номером дома, а значение - числом жителей, проживающих в доме.
        Дома с нечетными номерами расположены на одной стороне улицы, с четными - на другой.
        Выяснить, на какой стороне улицы проживает больше жителей.
        4. Вывести на экран сообщение: "В домах с нечетными номерами проживает больше жителей." или
        "В домах с четными номерами проживает больше жителей."

        Примечание:
        дом с порядковым номером 0 считать четным.


        Требования:
        1. Программа должна создавать массив на 15 целых чисел.
        2. Программа должна считывать числа для массива с клавиатуры.
        3. Программа должна вывести сообщение "В домах с нечетными номерами проживает больше жителей.",
        если сумма нечетных элементов массива больше суммы четных.
        4. Программа должна вывести сообщение "В домах с четными номерами проживает больше жителей.",
        если сумма четных элементов массива больше суммы нечетных.
*/

public class ChetnyeNechetnyeDoma {

        public static void main(String[] args) throws IOException {
            int[] array = new int[15];
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int resultChet = 0;
            int resultNechet = 0;
            for (int i = 0; i < array.length; i++) {
                String name = reader.readLine();
                array[i] = Integer.parseInt(name);

                if (i == 0 || i % 2 == 0) {
                    resultChet += array[i];
                } else if (i % 2 != 0) {
                    resultNechet += array[i];
                }
            }
            if (resultChet > resultNechet) {
                System.out.println("В домах с четными номерами проживает больше жителей.");
            } else {
                System.out.println("В домах с нечетными номерами проживает больше жителей.");
            }
        }
}


