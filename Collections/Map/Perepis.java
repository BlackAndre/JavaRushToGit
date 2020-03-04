package Collections.Map;

import java.util.HashMap;
import java.util.Map;

/*
Перепись населения
Перепись населения
Создать словарь (Map<String, String>) занести в него десять записей по принципу "Фамилия" - "Имя".
Проверить сколько людей имеют совпадающие с заданным именем или фамилией.


Требования:
1. Программа не должна выводить текст на экран.
2. Программа не должна считывать значения с клавиатуры.
3. Метод createMap() должен создавать и возвращать словарь Map с типом элементов String, String состоящих из 10 записей по принципу «Фамилия» - «Имя».
4. Метод getCountTheSameFirstName() должен возвращать число людей у которых совпадает имя.
5. Метод getCountTheSameLastName() должен возвращать число людей у которых совпадает фамилия.
 */

    public class Perepis {
        public static Map<String, String> createMap() {
            Map<String, String> people = new HashMap<>(); // создается массив имен
            for (int i = 0; i < 10; i++) {
                people.put("Залупова", "Андрей");
                people.put("Иванов", "Дима");
                people.put("Сидоров", "Сергей");
                people.put("Иванова", "Ваня");
                people.put("Муудаков", "Андрей");
                people.put("Сиськов", "Мудень");
                people.put("Педиков", "Педик");
                people.put("Бульдогов", "Сиська");
                people.put("Сосисков", "Бульдог");
                people.put("Залупов", "Сосиcка");
            }
            return people;
        }

        // метод для поиска повторяющихся имен
        public static int getCountTheSameFirstName(Map<String, String> map, String name) {
            int count = 0; //счетчик
            for (Map.Entry<String, String> pair : map.entrySet()) { // через for-each проверяется каждый элемент множества Map
                String value = pair.getValue(); // в переменную value записывается значение
                if (value.equals(name)) {  // если значение совпадает со значением переданным в аргумент (name)
                    count++; // счетчик плюсует
                }
            }
            return count;
        }

        public static int getCountTheSameLastName(Map<String, String> map, String lastName) {
            // так как в Map может быть только один ключ( но значения могут повторяться)
            // то в этом методе достаточно проверить на то, что есть ли в фамилия переданная в метод вообще в списке.
            int lastnames = 0;
            for (Map.Entry<String, String> pair : map.entrySet()) {
                if (lastName.equals(pair.getKey())) {
                    return 1; // если есть возвращается 1
                }
            }
            return lastnames; // если нет вовзращается 0.
        }

        public static void main(String[] args) {

        }
    }