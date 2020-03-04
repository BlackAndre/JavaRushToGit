package Collections.Set;

import java.util.HashSet;
import java.util.Set;

public class MoreThan10 {
/*
Больше 10? Вы нам не подходите
Больше 10? Вы нам не подходите
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Класс Solution должен содержать только три метода.
4. Метод createSet() должен создавать и возвращать множество Set состоящих из 20 различных чисел.
5. Метод removeAllNumbersGreaterThan10() должен удалять из множества все числа больше 10.
*/

        public static Set<Integer> createSet() {
            Set <Integer> set = new HashSet(); // создается множество Set и записывается 20 цифр с 0 до 20
            for (int i = 0; i < 20; i++) {
                set.add(i);
            }
            return set;
        }

        public static Set<Integer> removeAllNumbersGreaterThan10(Set<Integer> set) {
            Set<Integer> copyOfset = new HashSet<Integer>(set); // создается НОВОЕ множество- копия
            // так как цикл for-each не может проходить по циклу и удалять элементы одновременно
            // в итоге цикл проходить по копии множества set, а удаляет из оригинала
            for (Integer i : copyOfset) {
                if (i > 10)
                    set.remove(i);
            }
            return set;
        }

        public static void main(String[] args) {

        }
    }
