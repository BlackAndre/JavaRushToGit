package Collections.List;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MostLongSequence {
    /*
    Cамая длинная последовательность
1. Создай список чисел.
2. Добавь в список 10 чисел с клавиатуры.
3. Вывести на экран длину самой длинной последовательности повторяющихся чисел в списке.

Пример для списка 2, 4, 4, 4, 8, 8, 4, 12, 12, 14:
3

Искомое значение равно 3, т.к. самая длинная последовательность повторяющихся чисел состоит из трех четверок.


    */
    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList(); // создаем коллекцию List
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // ввод  с клавиатуры
        for (int i = 0; i < 10; i++) {
            String name = reader.readLine();
            int num = Integer.parseInt(name);
            list.add(num);
        }

        int count = 1; // счетчик, начинается с 1, т.к. если все цифры разные, должно выйти 1.
        List<Integer> counts = new ArrayList<Integer>(); // создается коолекция которая будет хранить счетчик

        // прогоняется по каждому элементу введенному с клавы и сверяется с предыдущим
        for (int i = 1; i < 10; i++) {
            if (list.get(i).equals(list.get(i - 1))) {
                count++;
                if (count > 1) {  // если одинаковые элементы найдены, счетчик добавляется в массив counts
                    counts.add(count);
                }
            } else { // если повторение прекратилось счетчик обнуляется до 1.
                count = 1;
            }
        }
        if (counts.size() == 0) { // если все цифры были разные и в массив ничего не добавлялось, вывести 1.
            System.out.println(1);
        } else { // если добавлялось, то выводится максимальное значение из массива.
            System.out.println((int) Collections.max(counts));
        }

    }
}