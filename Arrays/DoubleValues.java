package Arrays;
/*Удваиваем слова
        1. Введи с клавиатуры 10 слов в список строк.

        2. Метод doubleValues должен удваивать слова по принципу:
        "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма"

        3. Выведи результат на экран, каждое значение с новой строки.


        Требования:
        1. Объяви переменную типа список строк и сразу проинициализируй ee.
        2. Считай 10 строк с клавиатуры и добавь их в список.
        3. Метод doubleValues должен удваивать элементы списка по принципу "альфа", "бета", "гамма" -> "альфа", "альфа", "бета", "бета", "гамма", "гамма".
        4. Выведи получившийся список на экран, каждый элемент с новой строки.

 */
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class DoubleValues {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList();
        for (int i = 0; i <10; i++) {
            list.add(new BufferedReader(new InputStreamReader(System.in)).readLine());
        }

        ArrayList<String> result = doubleValues(list);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        ArrayList<String> result = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i));
            result.add(list.get(i));
        }
        return result;
    }
}
